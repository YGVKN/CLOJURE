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
                 [garden "1.3.6"]
                 [org.clojure/java.jdbc "0.7.8"]
                 [postgresql/postgresql "9.1-901-1.jdbc4"]]
  :profiles {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                                  [ring-mock "0.1.5"]]}
             :uberjar {:aot :all}}
  :plugins [[lein-pprint "1.2.0"]
            [lein-ring "0.12.4"]]
  :soure-paths ["src"]
  :prep-tasks []
  :ring {:handler app.run/-main
         :auto-reload? true}
  :garden {:builds [{:id style
                     :source-paths ["src"]
                     :stylesheet app.styles.styles/style
                     :compiler {:output-to "resources/public/css/styles.css"}
                     :pretty-print? true}]}
  :uberjar-name app
  :main app.run)



