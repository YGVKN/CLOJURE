(defproject zhuzha "0.1.4"
  :description "YGVKN/ZHUZHA"
  :url "waww.io"
  :update :always
  :min-lein-version "^2.8.1"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.9.908"]
                 [ring/ring "1.7.1"]
                 [hiccup "1.0.5"]
                 [garden "1.3.6"]
                 [compojure "1.6.1"]
                 [org.clojure/core.async "0.4.474"]]

  :plugins [[lein-ring "0.12.4"]
            [lein-garden "0.3.0"]
            [compojure "1.6.1"]
            [lein-cljsbuild "1.1.7"]
            [lein-figwheel "0.5.13"]]

  :source-paths ["src"]

  :garden {:builds [{
                     :source-paths ["src"]
                     :stylesheet zhuzha.styles.styles/style
                     :compiler {:output-to "resources/public/css/styles.css"}
                     :pretty-print? true}]}

  :prep-tasks [["garden" "once"]]

  :cljsbuild {:builds
              [{:id "dev"
                :source-paths ["src"]
                :figwheel {:on-jsload "zhuzha.cljs.index/on-js-reload"
                           :open-urls ["http://localhost:3449/index.html"]}

                :compiler {:main zhuzha.cljs.index
                           :asset-path "js/compiled/out"
                           :output-to "resources/public/js/compiled/index.js"
                           :output-dir "resources/public/js/compiled/out"
                           :source-map-timestamp true
                           :preloads [devtools.preload]}}
               {:id "min"
                :source-paths ["src"]
                :compiler {:output-to "resources/public/js/compiled/index.js"
                           :main app.core
                           :optimizations :advanced
                           :pretty-print false}}]}

  :figwheel {:css-dirs ["resources/public/css"]}

  :ring {:handler zhuzha.core/handler
         :auto-reload? true
         :auto-refresh? false
         :port 8888})

