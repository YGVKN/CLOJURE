(ns zhuzha.views.not_found.not_found
  (:require [hiccup.core :refer :all]))

(defn not-found []
  (html
    [:h1
     [:mark {:class "not-found"} "Page not found..."]]))
     
    
        
