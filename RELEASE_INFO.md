# Echo Music v5.2.83
- Integrated robust PoToken and Cipher pipeline to reliably play age-restricted and uploaded tracks.
- Fixed playback failures for age-restricted songs by properly encoding PoTokens and avoiding HEAD validation on WEB_REMIX streams.
- Added remote over-the-air cipher configuration updates. When YouTube changes their player logic, the app will automatically fetch the latest cipher mappings from the Echo Music repository without requiring an APK update.
- Added "Echo Extractor" setting under Player & Audio to view the last cipher update time and manually fetch new rules.
- Removed Third party fallback logic completely.
- Optimized liquid glass styling for light mode by making the text color adaptive by default.
- Fixed an issue where the liquid glass floating mini player would revert to the standard mini player design on album and playlist screens by making the bottom navigation bar persistent across these detail screens.

