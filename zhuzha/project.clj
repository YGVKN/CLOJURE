(defproject zhuzha "0.1.4"
  :description "YGVKN/ZHUZHA"
  :url "waww.io"
  :update :always
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [ring/ring "1.7.1"]
                 [hiccup "1.0.5"]
                 [garden "1.3.6"]
                 [compojure "1.6.1"]]
  :min-lein-version "2.8.1"
  :plugins [[lein-ring "0.12.4"]
            [lein-garden "0.3.0"]
            [compojure "1.6.1"]]
  :garden {:builds [{:source-paths ["src"]
                     :stylesheet zhuzha.styles.styles/style
                     :compiler {:output-to "resources/public/css/styles.css"}
                     :pretty-print? true}]}
  :prep-tasks [["garden" "once"]]
  :clean-targets "resources/public/css/styles.css"
  :ring {:handler zhuzha.core/handler
         :auto-reload? true
         :auto-refresh? false
         :port 8888})

