(ns app.views.page
  (:require [clojure.string :as str]
            [hiccup.page :as page]
            [ring.util.anti-forgery :as util]))

(def links
  [:div.link
   "["
   [:a.pagelink {:href "/"} "main"]
   "]"])

(defn header
  [title]
  [:head
   [:title (str "Location " title)]
   (page/include-css "/css/garden.css")])

(defn page
  []
  (page/html5
    (header "main")
    links
    [:h2 "yetAnother page"]
    [:div.text "garden generate css to file"]))
