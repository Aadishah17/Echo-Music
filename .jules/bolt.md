## 2024-05-18 - Compose Performance Optimization\n**Learning:** When collecting state flows in Jetpack Compose, using `collectAsState` without lifecycle awareness means flows will continue emitting updates even when the app is in the background, consuming CPU and battery. \n**Action:** Use `collectAsStateWithLifecycle()` from `androidx.lifecycle.compose` to ensure flow collection stops when the screen is hidden, making backgrounding the app much more efficient.

## 2024-05-18 - Compose List Inline distinctBy Performance Optimization
**Learning:** Using `distinctBy` or similar O(N) inline collection operations directly inside `items()` blocks of Lazy columns/grids in Jetpack Compose means the transformation recomputes on every composition.
**Action:** Wrap these list transformations in `remember(items) { items.distinctBy { ... } }` to ensure they are only recalculated when the underlying data changes, avoiding unnecessary CPU usage and possible UI stutter.
