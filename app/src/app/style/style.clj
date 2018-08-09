(ns app.style.style
  (:require [garden.core :as g]
            [garden.units :as u]
            [garden.selectors :as s]
            [garden.stylesheet :as stylesheet]
            [garden.def :refer [defstylesheet defstyles]]))
;;common style
(defstyles styles
 [:body {:background-color "#fff"
         :margin 0
         :padding 0
         :box-sizing "border-box"}]
 [:div.sphere {:width "1111px"
               :height "100%"
               :background-color "#ff73ba"
               :margin "0 auto"
               :color "#fff"
               :text-align "center"}])
