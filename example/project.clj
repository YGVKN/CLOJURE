(defproject example "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :author "YGVKN"

  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}

  :mailing-list {:name "mailing list"
                 :post "denisyagovkin@mail.ru"}

  :min-lein-version "2.9.8"


  :dependencies [[org.clojure/clojure "1.11.1"]
                 [org.clojure/tools.logging "1.2.4"]
                 [org.clojure/tools.namespace "1.3.0"]
                 [info.sunng/ring-jetty9-adapter "0.17.7"]
                 [compojure "1.7.0"]]


  :plugins [[lein-ancient "0.7.0"]
            [lein-cljfmt "0.9.0"]]
  :main ^:skip-aot example.core
  ;:aot [example.core]
  ;:aot :all
  :auto-clean true
  :target-path "target/%s"
  :profile {:uberjar {:aot :all}}
  :jar-name "example.jar"
  :uberjar-name "example-standalone.jar"
  ;:warn-on-reflection true


  :jvm-opts ["-Xmx3g"]

  :repl-options {:welcome (println "\u001b[35mYGVKN \u001b[36m\u03bb\u001b[36m")
                 :init-ns example.core
                 :timeout 40000
                 :host "0.0.0.0"
                 :port 4444})
