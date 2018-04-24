(ns ygvkn.core
  (:require [compojure.core :refer :all]
            [org.httpkit.server :refer [run-server]])

  (:gen-class))


(defroutes app
  (GET "/" [] "YGVKN"))

(defn -main []
  (let [port (Integer/parseInt (or (System/getenv "PORT") "7777"))]
    (run-server app {:port port})
    (println (str "Listening on port " port))))
