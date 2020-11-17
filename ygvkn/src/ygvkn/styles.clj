(ns ygvkn.styles
  (:require [garden.core :refer [css]])
  (:gen-class))

(defn style []
  (css [:body {:color "violet"}]))

