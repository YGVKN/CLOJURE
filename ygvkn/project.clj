(defproject ygvkn "0.1.0"
  :description "Clojure YGVKN web app"
  :url "https://waww.io"
  :min-lein-version "2.8.1"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [compojure "1.6.1"]
                 [http-kit "2.2.0"]]

  :main ygvkn.core
  :aot [ygvkn.core])
