(defproject app "0.1.0-SNAPSHOT"
  :description "ygvkn.zhuzha.clojure.web.app"
  :url "https://waww.io"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [compojure "1.6.1"]
                 [hiccup "1.0.5"]
                 [garden "1.3.5"]
                 [ring/ring-defaults "0.3.2"]]
  :plugins [[lein-ring "0.12.4"]
            [lein-garden "0.3.0"]]
  :garden {:build [{
                    :id "screen"
                    :source-paths ["src/styles"]
                    :stylesheet app.style.style/screen
                    :compiler {:output-file "resources/screen.css"
                               :pretty-print? false}
                    }]}
  :ring {:handler app.core/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.2"]]}})
