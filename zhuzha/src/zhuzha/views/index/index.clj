(ns zhuzha.views.index.index
  (:require [hiccup.core :refer :all]
            [hiccup.page :as html5]
            [hiccup.element :as elem]
            [garden.core :as garden]
            [zhuzha.styles.index.styles :as style]))

(declare added)
(defn index []
  (html5/html5
    [:head
     [:meta {:charset "utf-8"}]
     [:title "clojure web app"]
     (html5/include-css "./css/styles.css")
     (html5/include-js "./js/index.js")]
    [:body
     [:header {:class "header"} "header"]
     [:div {:class "sphere"}
      [:div {:onclick "echo()"}"click me"] "sphere"]
     [:div (added)]]))


(defn added []
  (html [:ul
         (let [y "this is something"]
           (for [x (range 0 10)] [:li y]))]))


