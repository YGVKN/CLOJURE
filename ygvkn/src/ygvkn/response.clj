(ns ygvkn.response
  (:require [ring.middleware.json :refer [wrap-json-response]]
            [ring.util.response :refer [response]])
  (:gen-class))



(defn res-json [req]
  (response {:foo "bar"}))

(def app
  (wrap-json-response res-json))
