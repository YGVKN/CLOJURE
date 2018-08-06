(defproject app-enlive "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[ring "1.7.0-RC1"]
                 [compojure "1.6.1"]
                 [enlive "1.1.6"]
                 [org.clojure/clojure "1.9.0"]]
  :plugins [[lein-ring "0.12.4"]]
  :ring {:handler app-enlive.core/app})
