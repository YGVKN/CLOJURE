(defproject ygvkn "0.1.4-SNAPSHOT"
  :author "YGVKN"
  :description "http-kit app"
  :url "zhuzha.io"
  :min-lein-version "2.9.4"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [http-kit "2.5.0"]
                 [compojure "1.6.2"]
                 [ring/ring-json "0.5.0"]
                 [com.taoensso/carmine "3.0.1"]
                 [hiccup "1.0.5"]
                 [garden "1.3.10"]]

  :plugins [[lein-ancient "0.6.15"]]
  :auto-clean true

  :main ygvkn.core
  :aot :all
  :target-path "target/%s"
  :jar-name "ygvkn.jar"
  :uberjar-name "ygvkn-standalone.jar"
  :jvm-opts ["-Xmx1g"]
  :deploy-branches ["ygvkn"]

  :repl-options {:welcome (println "Welcome YGVKN/ZHUZHA")
                 :init-ns ygvkn.core
                 :init (println (str "Here we are in" *ns*))
                 :timeout 33333
                 :host "0.0.0.0"
                 :port 9999}

  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
