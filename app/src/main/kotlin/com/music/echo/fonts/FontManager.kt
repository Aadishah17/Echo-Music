package iad1tya.echo.music.fonts

import android.content.Context
import android.graphics.Typeface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import timber.log.Timber

/**
 * Turns installed font files into Compose [FontFamily] instances, cached per family.
 *
 * Building the family is cheap (Compose loads the file lazily on first draw), but it is done on
 * every recomposition of the theme if not memoised, hence the cache. [invalidate] must be called
 * whenever a family is installed or removed.
 */
object FontManager {
    private val cache = mutableMapOf<String, FontFamily?>()
    private val typefaceCache = mutableMapOf<String, Typeface?>()

    /**
     * The [FontFamily] for [fontId], or `null` for the system font and for ids whose files are
     * gone (deleted from disk, restored from a backup on another device, ...).
     */
    fun familyFor(context: Context, fontId: String): FontFamily? {
        if (fontId.isEmpty()) return null

        synchronized(cache) {
            if (cache.containsKey(fontId)) return cache[fontId]
        }

        val family = build(context, fontId)
        synchronized(cache) { cache[fontId] = family }
        return family
    }

    /**
     * The same family as an Android [Typeface], for the parts of the app that draw text straight
     * onto a Canvas and so never see Compose's font resolution — the shared lyrics image, mainly.
     */
    fun typefaceFor(context: Context, fontId: String): Typeface? {
        if (fontId.isEmpty()) return null

        synchronized(typefaceCache) {
            if (typefaceCache.containsKey(fontId)) return typefaceCache[fontId]
        }

        val typeface = try {
            // Lowest weight first, so the regular face is the base the caller derives bold from.
            FontStorage.variantFiles(context, fontId)
                .minByOrNull { it.key }
                ?.value
                ?.let { Typeface.createFromFile(it) }
        } catch (e: Exception) {
            Timber.w(e, "Could not load typeface $fontId")
            null
        }

        synchronized(typefaceCache) { typefaceCache[fontId] = typeface }
        return typeface
    }

    fun invalidate(fontId: String) {
        synchronized(cache) { cache.remove(fontId) }
        synchronized(typefaceCache) { typefaceCache.remove(fontId) }
    }

    fun clearCache() {
        synchronized(cache) { cache.clear() }
        synchronized(typefaceCache) { typefaceCache.clear() }
    }

    private fun build(context: Context, fontId: String): FontFamily? = try {
        val files = FontStorage.variantFiles(context, fontId)
        if (files.isEmpty()) {
            null
        } else {
            FontFamily(
                files.entries.sortedBy { it.key }.map { (variant, file) ->
                    Font(
                        file = file,
                        weight = FontWeight(variant.weight),
                        style = if (variant.italic) FontStyle.Italic else FontStyle.Normal,
                    )
                },
            )
        }
    } catch (e: Exception) {
        Timber.w(e, "Could not load font $fontId")
        null
    }
}

/** Resolves the family for [fontId], recomputing only when the id changes. */
@Composable
fun rememberFontFamily(fontId: String): FontFamily? {
    val context = LocalContext.current
    return remember(fontId) { FontManager.familyFor(context, fontId) }
}
