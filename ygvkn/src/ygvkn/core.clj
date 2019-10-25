(ns ygvkn.core
  (:require [ring.adapter.jetty :as jetty])
  (:gen-class))

(defn handler [req]
  {:status 200
   :headers {"Content-Type", "text/plain"}
   :body "Clojure app"})

(defn -main []
  (jetty/run-jetty handler {:port (Integer. 8888)}))

