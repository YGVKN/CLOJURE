(ns app.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [app.views.index :as index]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes app-routes
  (GET "/"
   []
   (index/index))
  (route/not-found "Don't worry ,be happy,drink coffee"))

(def app
  (wrap-defaults app-routes site-defaults))
