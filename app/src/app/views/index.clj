(ns app.views.index
  (:require [clojure.string :as str]
            [hiccup.page :as page]
            [ring.util.anti-forgery :as util]))

(def links
  [:div.links
   "["
   [:a {:href "/"} "main"]
   "]"])

(defn header
  [title]
  [:head
   [:meta {:charset "UTF-8"}]
   [:title (str "Here... " title)]
   (page/include-css "/css/garden.css")])

(defn index
  []
  (page/html5
    (header "main")
   [:body
    [:div.sphere
     [:div links]
     [:div "main page"]]]))
