# bench-update

```clojure
"Bench: " (update {:a 1} :a inc)
Evaluation count : 144374280 in 60 samples of 2406238 calls.
             Execution time mean : 666.183336 ns
    Execution time std-deviation : 319.577446 ns
   Execution time lower quantile : 427.993959 ns ( 2.5%)
   Execution time upper quantile : 1.611172 µs (97.5%)
                   Overhead used : 15.471599 ns

Found 4 outliers in 60 samples (6.6667 %)
  low-severe   4 (6.6667 %)
 Variance from outliers : 98.2239 % Variance is severely inflated by outliers
```

```clojure
"Bench: " (update-in {:a 1} [:a] inc)
Evaluation count : 35216400 in 60 samples of 586940 calls.
             Execution time mean : 1.446455 µs
    Execution time std-deviation : 368.578281 ns
   Execution time lower quantile : 1.020687 µs ( 2.5%)
   Execution time upper quantile : 2.056206 µs (97.5%)
                   Overhead used : 15.471599 ns

Found 1 outliers in 60 samples (1.6667 %)
  low-severe   1 (1.6667 %)
 Variance from outliers : 94.6380 % Variance is severely inflated by outliers
```

```clojure
"Bench: " (update-in' {:a 1} [:a] inc)
Evaluation count : 59277780 in 60 samples of 987963 calls.
             Execution time mean : 963.125461 ns
    Execution time std-deviation : 294.746262 ns
   Execution time lower quantile : 661.983296 ns ( 2.5%)
   Execution time upper quantile : 1.805590 µs (97.5%)
                   Overhead used : 15.471599 ns

Found 4 outliers in 60 samples (6.6667 %)
  low-severe   2 (3.3333 %)
  low-mild   2 (3.3333 %)
 Variance from outliers : 96.4068 % Variance is severely inflated by outliers
nil
```
