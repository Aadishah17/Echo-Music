## 2024-05-19 - Removed Main Thread `runBlocking` Calls in ExoPlayer Callbacks
**Learning:** `runBlocking` was used inside `onMediaItemTransition` and `onPlaybackStateChanged` within `MusicService.kt` to read `RepeatMode` from the DataStore. This blocks the main/player thread on disk I/O, which is a known performance anti-pattern that leads to UI stutters, audio playback gaps, and ANRs.
**Action:** Instead of reading from the DataStore synchronously, read `player.repeatMode` directly as ExoPlayer already manages this state and syncs it with DataStore. Avoid `runBlocking` in any callback executed on the main or player thread.

## 2024-05-19 - Unreliable Maven Repositories Slowing Down CI
**Learning:** The Aliyun Maven Repository (`maven.aliyun.com`) was included in both `build.gradle.kts` and `settings.gradle.kts` and resulted in an intermittent 502 Bad Gateway response when downloading the Protobuf plugin.
**Action:** Do not rely on unreliable mirrors unless absolutely necessary. Rely on stable, robust repositories like Maven Central and Google's Maven repository for CI reliability.
