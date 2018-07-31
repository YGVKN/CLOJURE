(ns app.style.style
  (:require [garden.core :as g]
            [garden.units :as u]
            [garden.selectors :as s]
            [garden.stylesheet :as stylesheet]))

(g/css {:output-to "resources/public/css/garden.css"}
       [:a.pagelink {:color "deeppink"}])
