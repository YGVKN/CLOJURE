(ns origin.types.types
  (:require
    [clojure.repl :refer :all])
  (:gen-class))

(defn types-out
  []
  (prn (type 'symbol))
  (prn (type \u03bb))
  (prn (type "string"))
  (prn (type '()))
  (prn (type '(a b c d e)))
  (prn (type []))
  (prn (type '[abc de]))
  (prn (type :keyword))
  (prn (type {:key :value}))
  (prn (type '#{a b c}))
  (prn (type nil)))
(types-out)
