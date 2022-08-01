(ns example.core
  (:require
    [clojure.tools.logging :as log]
    [clojure.tools.namespace.repl :refer [refresh]]
    [clojure.java.shell :as shell]
    [compojure.route          :as route]
    [compojure.core           :refer (ANY GET POST defroutes)])
  (:gen-class))


(defn show-cmd
  []
  (-> (shell/sh "ls" "-la")
    :out
    println))

(defn date-time
  []
  (let [date (.toString (java.util.Date.))]
    (println date)))

(defn -main
  [& xs]
  (date-time))

;(defn -main [& xs]
;  (println xs)
;  (.start
;    (Thread. show-cmd)))
