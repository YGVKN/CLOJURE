(ns app.views.garden
  (:require (hiccup [page :refer [html5 include-css include-js]]
                    [element :refer [link-to]]
                    [core :refer [html]])
            (garden [core :refer [css]]
                    [stylesheet :refer [at-media]]
                    [units :as u :refer [px pt em]]
                    [color :as color :refer [hsl rgb]]
                    [def :refer [defstylesheet defstyles]])))
(declare page-css)
(def title "Clojure garden css")

(defn page []
  (html5 [:head
          [:meta {:charset "UTF-8"}]
          [:title title]
          [:style {:type "text/css" } (page-css)]]
         [:body
          [:div.sphere  " Clojure garden"]]))


(defn page-css []
  (css [:body {:background "#fff" :margin 0 :padding 0 :box-sizing "border-box"}]
        [:div.sphere
         {:width (px 1111)
          :height "100%"
          :margin "0 auto"
          :background-color "#ff72be"
          :text-align "center"
          :color "#fff"}]))
