(ns app.views.index
  (:require [garden.core :refer :all])
  (:use hiccup.page hiccup.element))

(defn index-page
  []
  (html5
    [:html
     [:head]
     [:body
      [:h1 {:class "header"}"clojure web app"]]]))


