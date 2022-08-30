(ns example.core
  (:require
   [clojure.tools.logging :as log]
   [clojure.tools.namespace.repl :refer [refresh]]
   [compojure.route          :as route]
   [compojure.core           :refer (ANY GET POST defroutes)]
   [ring.adapter.jetty9 :as jetty]
   [clojure.pprint])
  (:gen-class))

(defn date-time
  []
  (let [date (.toString (java.util.Date.))]
    date))



(defn handler [request]
  (clojure.pprint/pprint request)
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Here"})

(def server (jetty/run-jetty #'handler {:port 3000 :join? false}))

(.stop server)
(.start server)

(defn -main
  [& args]
  (jetty/run-jetty #'handler
                   {:port 3000
                    :join? false}))


