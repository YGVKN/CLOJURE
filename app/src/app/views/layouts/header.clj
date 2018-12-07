(ns app.views.layouts.header
  (:require [hiccup.core :refer :all]
            [hiccup.page :refer :all]))
(defn header [title & rest]
  (html5 {:lang "ru"}
         [:head
          [:meta {:charset "UTF-8"}]
          [:meta {:http-equiv "X-UA-Compatible"}]
          [:meta {:content "text/html" :charset "UTF-8" :http-equiv "Content-Type"}]
          [:meta {:name "description" :content "clojure web app"}]
          [:title title]
          [:style {:type "text/css"}]]
         [:body {:class "sphere"} rest]))
