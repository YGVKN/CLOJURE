(ns ygvkn.routing
  (:require [compojure.core :refer :all]
            [compojure.route :as route])
  (:gen-class))

(defn index [] "YGVKN/ZHUZHA")

(defroutes app-routes
  (GET "/" [] (index))
  (context "/api"  []
    (GET "/ygvkn"  [] "api/ygvkn")
    (GET "/zhuzha" [] "api/zhuzha"))
  (route/not-found "<img src='https://media.giphy.com/media/V4iVlA2tScmjK/giphy.gif' width='500' height='281' alt='GIZMO 404'/>"))
