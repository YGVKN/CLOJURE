(ns app.core
  (:require [compojure.core :refer :all]
            [compojure.handler :as handler]
            [compojure.route :as route]
            [app.views.index :as index-page]))

(defroutes app-routes
  (GET "/" [] (index-page/index-page))
  (route/resources "/")
  (route/not-found "Page not found"))

(def handler
  (handler/site app-routes))
