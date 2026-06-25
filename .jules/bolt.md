# Bolt's Performance Journal

## 2024-05-18 - [ExoPlayer and Jetpack DataStore Blocking]
**Learning:** Avoid using `runBlocking` to synchronously read Jetpack DataStore within ExoPlayer main-thread callbacks (e.g., `onMediaItemTransition`, `onPlaybackStateChanged`). This blocks the UI thread, causing stutters and potential ANRs.
**Action:** Read directly from cached player properties like `player.repeatMode` and `player.shuffleModeEnabled`, which are kept in sync with DataStore, or use asynchronous reads via `scope.launch(Dispatchers.IO)`.

## 2024-05-18 - [Gradle Configuration Anti-Patterns]
**Learning:** Avoid using `exec { ... }` or `ProcessBuilder().start().waitFor()` directly in `build.gradle.kts` configuration blocks (e.g., to generate keystores). This causes synchronous, blocking behavior on *every single Gradle sync* and severely slows down configuration times.
**Action:** To resolve CI/CD missing file issues (like debug keystores), execute scripts or generate missing assets from the CI pipeline (e.g., `keytool` command directly in GitHub Actions steps) instead of burying the logic in the Gradle build script itself.
