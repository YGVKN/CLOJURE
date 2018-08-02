(ns app.style.style
  (:require [garden.core :as g]
            [garden.units :as u]
            [garden.selectors :as s]
            [garden.stylesheet :as stylesheet]
            [garden.def :refer [defstylesheet defstyle]]))

(defstylesheet screen
            {:output-file "resources/public/garden.css"}
            [:body {:background "pink"}]
            [:a {:text-decoration "none"}])
