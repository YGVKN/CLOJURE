(ns app.views.garden
  (:require (hiccup [page :refer [html5 include-css include-js]]
                    [element :refer [link-to]]
                    [core :refer [html]])
            (garden [core :refer [css]]
                    [stylesheet :refer [at-media]]
                    [units :as u :refer [px pt em]]
                    [color :as color :refer [hsl rgb]]
                    [def :refer [defstyles]])
                    [ring.util.anti-forgery]))
(declare page-css)


(defn page []
  (html5 [:head
          [:title "css garden"]
          [:style {:type "text/css" } (page-css)]]
         [:body
          [:a.link {:href "#"} "try garden"]]))
;;try garden css
(defn page-css []
  (css [:body {:background "violet"}
        [:a.link {:text-decoration "none"}]]))
