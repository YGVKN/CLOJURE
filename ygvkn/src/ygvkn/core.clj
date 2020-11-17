(ns ygvkn.core
  (:require [org.httpkit.server :refer [run-server]]
            [ygvkn.routing :refer [app-routes]])
  (:gen-class))


(defn base-res [req]
  {:status  200
   :headers {"Content-Type" "application/json; charset=utf-8"}
   :body "{\"HELLO\": \"ZHUZHA\"}"})

(defonce server (atom nil))

(defn stop-server []
  (when-not (nil? @server)
    (@server :timeout 0)
    (reset! server nil)))



(defn -main []
 (let [port (Integer/parseInt (or (System/getenv "PORT") "8888"))]
  (reset! server (run-server #'app-routes {:port port :join? false}))
  (println (str "Running server at http:/0.0.0.0:" port "/"))))
;;lein run
