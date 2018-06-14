(ns app.core
  (:require [compojure.core :refer :all]
            [compojure.handler :as handler]
            [compojure.route :as route]
            [app.views.index :as index-page]
            [app.views.page :as yet-page]))

(defroutes app-routes
  (GET "/" [] (index-page/index-page))
  (GET "/page" [] (yet-page/yet-another-page))
  (route/resources "/")
  (route/not-found "Page not found"))

(def handler
  (handler/site app-routes))
