(defproject app "0.1.0-SNAPSHOT"
  :description "clojure web app"
  :plugins [[lein-ring "0.12.4"]
            [compojure "1.1.6"]]
  :ring {:handler app.core/handler
         :auto-reload? true
         :auto-refresh? false}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [ring/ring "1.2.1"]
                 [compojure "1.6.1"]
                 [garden "1.3.5"]
                 [hiccup "1.0.5"]])
