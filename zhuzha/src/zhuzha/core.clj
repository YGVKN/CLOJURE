(ns zhuzha.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [compojure.handler :as handler]
            [zhuzha.views.index.index :as view]
            [zhuzha.views.not_found.not_found :as not-found]))

(defroutes app
  (GET "/" [] (view/index))
  (route/resources "/")
  (route/not-found (not-found/not-found)))

(def handler
  (handler/site app))
