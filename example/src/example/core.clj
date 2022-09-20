(ns example.core
  (:require
   [clojure.tools.namespace.repl :refer (refresh refresh-all)]
   [clojure.tools.logging :as log]
   [ring.adapter.jetty9 :as jetty]
   [clojure.pprint :refer (pprint)])
  (:gen-class))

(defn date-time
  []
  (let [date (.toString (java.util.Date.))]
    date))

(defn -main
  [& rest]
  (println (type rest))
  (date-time))

;;
;;(defn handler [request]
;;  (clojure.pprint/pprint request)
;;  {:status 200
;;   :headers {"Content-Type" "text/html"}
;;   :body "Here"})
;;
;;(def server (jetty/run-jetty #'handler {:port 3000 :join? false}))
;;
;;(.stop server)
;;(.start server)
;;
;;(defn -main
;;  [& args]
;;  (jetty/run-jetty #'handler
;;                   {:port 3000
;;                    :join? false}))


