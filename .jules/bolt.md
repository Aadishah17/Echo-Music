# Bolt's Performance Journal

## 2024-05-18 - [ExoPlayer and Jetpack DataStore Blocking]
**Learning:** Avoid using `runBlocking` to synchronously read Jetpack DataStore within ExoPlayer main-thread callbacks (e.g., `onMediaItemTransition`, `onPlaybackStateChanged`). This blocks the UI thread, causing stutters and potential ANRs.
**Action:** Read directly from cached player properties like `player.repeatMode` and `player.shuffleModeEnabled`, which are kept in sync with DataStore, or use asynchronous reads via `scope.launch(Dispatchers.IO)`.
