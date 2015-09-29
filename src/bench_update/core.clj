(ns bench-update.core
  (:use [criterium.core]))

(defn update-in' 
  ([m [k & ks] f]
   (if ks
     (assoc m k (update-in (get m k) ks f))
     (assoc m k (f (get m k)))))
  ([m [k & ks] f & args]
   (if ks
     (assoc m k (apply update-in (get m k) ks f args))
     (assoc m k (apply f (get m k) args)))))

(defmacro bench-update [f]
  `(do (prn "Bench: " '~f)
       (bench ~f)))

(bench-update (update {:a 1} :a inc))
(bench-update (update-in {:a 1} [:a] inc))
(bench-update (update-in' {:a 1} [:a] inc))
