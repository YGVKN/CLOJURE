(ns app.style.style
  (:require [garden.core :as g]
            [garden.units :as u]
            [garden.selectors :as s]
            [garden.stylesheet :as stylesheet]
            [garden.def :refer [defstylesheet defstyles]]))

(defstyles styles
 [:body {:background "violet"}])
