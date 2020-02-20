(defproject app "0.2.0"
  :description "YGVKN/ZHUZHA"
  :url "https://waww.io"
  :min-lein-version "2.9.1"
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/clojurescript "1.10.597"]
                 [hiccup "1.0.5"]
                 [garden "1.3.9"]
                 [compojure "1.6.1"]
                 [ring/ring-core "1.8.0"]
                 [ring/ring-jetty-adapter "1.8.0"]]

  :plugins [[lein-ring "0.12.5"]
            [lein-garden "0.3.0"]
            [lein-ancient "0.6.15"]]

  :ring {:handler server.run/index
         :auto-reload? true
         :port 8888}

  :garden {:builds [{:id "styles"
                     :source-paths ["src"]
                     :stylesheet service.out/styles
                     :compiler {:output-to "resources/public/styles.css"
                                :pretty-print? false}}]}
  :prep-tasks [["garden" "once"]]

  :main service.out
;;  :aot [service.out]
  :aot :all
  :jar-name "zhuzha-service.jar"
  :uberjar-name "zhuzha-service-standalone.jar"
  :repl-options {:welcome (println "Welcome YGVKN/ZHUZHA")
                 :init-ns service.out
                 :init (println "Here we are in" *ns*)
                 :host "0.0.0.0"
                 :port 4444}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.4.0"]]}})
