(defproject app "0.1.1"
  :description "clojure ring web app"
  :url "waww.io"
  :update :always
  :min-lein-version "^2.8.1"
  :license {:name "ZHUZHA"
            :url "https://waww.io"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [ring "1.7.1"]
                 [ring/ring-core "1.7.1"]
                 [ring/ring-json "0.4.0"]
                 [ring/ring-jetty-adapter "1.7.1"]
                 [compojure "1.6.1"]
                 [hiccup "1.0.5"]
                 [garden "1.3.6"]]
  :profiles {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                                  [ring-mock "0.1.5"]]}}
  :plugins [[lein-pprint "1.2.0"]
            [lein-ring "0.12.4"]]
  :soure-paths ["src"]
  :prep-tasks []
  :ring {:handler app.run/-main
         :auto-reload? true}
  :garden {:builds [{
                     :source-paths ["src"]
                     :stylesheet app.styles.styles/style
                     :compiler {:output-to "resources/public/css/styles.css"}
                     :pretty-print? true}]}
  :main app.run)



