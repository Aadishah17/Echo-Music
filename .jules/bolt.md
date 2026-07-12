## 2024-05-18 - Compose Performance Optimization\n**Learning:** When collecting state flows in Jetpack Compose, using `collectAsState` without lifecycle awareness means flows will continue emitting updates even when the app is in the background, consuming CPU and battery. \n**Action:** Use `collectAsStateWithLifecycle()` from `androidx.lifecycle.compose` to ensure flow collection stops when the screen is hidden, making backgrounding the app much more efficient.

## 2024-05-24 - Compose distinctBy Recomposition
**Learning:** In Jetpack Compose, calling inline list transformations like `.distinctBy { it.id }` inside `items()` causes recomputation on every frame during scrolling/recomposition.
**Action:** Extract expensive list computations into a `remember(items)` block outside the `LazyColumn` / `LazyVerticalGrid` items scope.
