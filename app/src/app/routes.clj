(ns app.routes
  (:require [compojure.core :refer [defroutes GET POST context]]
            [compojure.route :refer [not-found]]
            [app.response.res :as res]
            [app.views.index :as index]))

(defroutes app
  (context "/api/data" []
    (GET "/" [] "root api")
    (GET "/profiles" [] "profiles")
    (GET "/meta" [] "meta data"))
  (GET "/" [] index/index "clojure web api" "index view")
  (GET "/req" [] res/info-req)
  (not-found res/page-not-found))
