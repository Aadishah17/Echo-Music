## 2024-06-22 - Avoid DataStore runBlocking in ExoPlayer callbacks
**Learning:** Synchronously reading Jetpack DataStore using runBlocking on the main thread within ExoPlayer callbacks (like onMediaItemTransition, onPlaybackStateChanged) causes UI stutters and potential ANRs, as these callbacks run on the main thread.
**Action:** Always read DataStore asynchronously using Coroutines, or utilize readily available ExoPlayer state (e.g., player.repeatMode, player.shuffleModeEnabled) instead of querying DataStore.
