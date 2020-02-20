(ns service.out
  (:require
    [ring.adapter.jetty :as jetty]
    [hiccup.page :refer [doctype html5]])
  (:gen-class))

(defn page [title content]
 (html5
  (doctype :html5)
  [:html
   [:head
    [:meta {:charset "utf-8"}
     [:title title]]]
   [:body content]]))


(defn index [req]
  {:status 200
   :headers {"Content-type", "text/html"}
   :body (page "Clojure web app" "Content")})



(defn -main []
 (let [port (Integer/parseInt (or (System/getenv "PORT") "8888"))]
  (jetty/run-jetty #'index {:port port :join? false})))

;lein run
