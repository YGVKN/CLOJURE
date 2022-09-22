(ns example.core
  (:require
   [clojure.tools.namespace.repl :refer (refresh refresh-all)]
   [clojure.tools.logging :as log]
   [ring.adapter.jetty9 :as jetty]
   [clojure.pprint :refer (pprint)])
  (:gen-class))

(defn date-time
  []
  (let [date (.toString (java.util.Date.))]
    date))

(defn -main
  [& rest]
  (println (type rest))
  (date-time))



