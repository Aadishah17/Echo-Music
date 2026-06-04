## 2024-05-19 - [Compose Recomposition Optimization]
**Learning:** Re-evaluating operations like `distinctBy` inside `LazyColumn` or `LazyVerticalGrid` `items` blocks causes expensive O(N) operations and garbage collection allocations on every recomposition. Recomposition happens frequently in music apps when `isPlaying` or `mediaMetadata` states change.
**Action:** Always wrap expensive list operations (filtering, distinctBy, sorting) passed to Lazy lists inside a `remember(key)` block so they only recalculate when the underlying data changes, not on every render frame.
