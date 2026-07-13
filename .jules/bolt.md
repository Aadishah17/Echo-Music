## 2024-05-18 - Compose Performance Optimization\n**Learning:** When collecting state flows in Jetpack Compose, using `collectAsState` without lifecycle awareness means flows will continue emitting updates even when the app is in the background, consuming CPU and battery. \n**Action:** Use `collectAsStateWithLifecycle()` from `androidx.lifecycle.compose` to ensure flow collection stops when the screen is hidden, making backgrounding the app much more efficient.

## 2026-07-13 - Compose Lists Performance Optimization
**Learning:** In Jetpack Compose UIs, computing values inside `items()` blocks of Lazy columns/grids (like `.distinctBy { it.id }`) causes recomputation on every composition.
**Action:** Wrap these list transformations in `remember(items) { ... }` so they only recalculate when the original list changes, significantly reducing overhead during scroll and rendering.

## 2026-07-13 - Compose Lists Performance Optimization
**Learning:** In Jetpack Compose UIs, computing values inside `items()` blocks of Lazy columns/grids (like `.distinctBy { it.id }`) causes recomputation on every composition.
**Action:** Wrap these list transformations in `remember(items) { ... }` so they only recalculate when the original list changes, significantly reducing overhead during scroll and rendering.
