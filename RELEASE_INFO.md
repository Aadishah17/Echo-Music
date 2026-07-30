# Echo Music v5.2.84
- Redesigned the automated Telegram release notification to feature a professional layout, using blockquotes for the changelog and improved formatting.
- Constrained the width of the Settings dialog and the Mini Player on tablets for a cleaner layout.
- Removed the redundant mini album art on the tablet landscape player.
- Clicking the mini album art next to the song title now toggles lyrics off (when available).
- Redesigned the tablet landscape player layout to a split-screen experience (like Apple Music), keeping the player properly proportioned while displaying lyrics.
- Fixed a critical issue where missing asset files (`po_token.html` and JS solvers) prevented PoToken generation and caused HTTP 403 errors on `WEB_REMIX` playback.
- Updated YouTube client definitions (TVHTML5_SIMPLY, VISIONOS, ANDROID_VR_1_65) and fallback validation rules.
- Added stream client tracking and display in Song Info, updated PoToken session handling, and enabled VISIONOS fallback client for improved playback reliability.
- Modified the music player page layout for tablets in landscape mode to a vertical, center-aligned view.