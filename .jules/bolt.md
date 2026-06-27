## 2024-05-18 - Compose Performance Optimization
**Learning:** When collecting state flows in Jetpack Compose, using `collectAsState` without lifecycle awareness means flows will continue emitting updates even when the app is in the background, consuming CPU and battery.
**Action:** Use `collectAsStateWithLifecycle()` from `androidx.lifecycle.compose` to ensure flow collection stops when the screen is hidden, making backgrounding the app much more efficient.

## 2026-06-27 - Compose Flow Collection Optimization
**Learning:** collectAsState continues to consume resources when the app is backgrounded, while collectAsStateWithLifecycle properly handles Android lifecycles, pausing flow collection appropriately to save battery and CPU.
**Action:** Always prefer androidx.lifecycle.compose.collectAsStateWithLifecycle() over androidx.compose.runtime.collectAsState() for UI state collection in Jetpack Compose to avoid wasteful background processing.
