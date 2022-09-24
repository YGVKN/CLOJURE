(ns origin.hello-world.hello-world
  (:require
    [clojure.repl :refer :all])
  (:gen-class))

(defn ^{:hello :world} hello-world
  "Some doc string"
  ^String [name]
  (str "hello, " name))

