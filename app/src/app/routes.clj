(ns app.routes
  (:require [compojure.core :refer [defroutes GET POST context]]
            [compojure.route :refer [not-found]]
            [app.response.res :as res]))
(defroutes api
  (context "/api/users" []
    (GET "/" [] "root api") ;the route that exists at "/user/current"
    (GET "/profile" [] "profile")
    (GET "/meta" [] "mata")))

(defroutes app
  (GET "/" [] res/index)
  (GET "/req" [] res/info-req)
  (not-found res/page-not-found))
