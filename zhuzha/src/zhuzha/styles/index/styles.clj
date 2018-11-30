(ns zhuzha.styles.index.styles
  (:require [garden.core :refer [css]]
            [garden.stylesheet :refer [at-media]]
            [garden.units :as unit :refer [px em]]
            [garden.color :as color :refer [rgba]]
            [garden.def :refer [defstyles]]))

;;(declare styles)
(defn index []
  (css [:body {:background "black" :color "deeppink"}]))

(defn styles []
  (css [:body {:background "deeppink"}]
       [:.header {:color "violet"}]))


