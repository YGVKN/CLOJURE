(ns app.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [app.views.index :as index]
            [app.views.garden :as garden]
            [app.views.page :as page]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes app-routes
 (GET "/"
  []
  (index/index))

 (GET "/css"
  []
  (garden/page))

 (GET "/gencss"
  []
  (page/page))


 (route/not-found "Don't worry ,be happy,drink coffee and ZHUZHA"))

(def app
  (wrap-defaults app-routes site-defaults))
