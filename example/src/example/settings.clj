(ns example.settings
  (:require
    [clojure.repl :refer :all])
  (:gen-class))
;;;(defn start! []
;;;  (alter-var-root
;;;    (var server)
;;;    (fn [server]
;;;      (if-not server
;;;        (jetty/run-jetty app {:port 8888 :join? false})
;;;        server))})
;;;
;;;(defn stop! []
;;;  (alter-var-root
;;;    (var server)
;;;    (fn [server]
;;;      (when server
;;;        (.stop server))
;;;      nil)))
;;
