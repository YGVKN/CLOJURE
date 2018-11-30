(ns zhuzha.styles.styles
  (:require [garden.def :refer [defstylesheet defstyles]]
            [garden.units :refer [px]]))

(defstyles style
  [:body {:background "black"
          :color "deeppink"
          :font-size (px 22)}]
  [:div.sphere {:color "violet"}])



