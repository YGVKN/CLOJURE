(ns example.main
  (:require
   [clojure.tools.namespace.repl :refer (refresh refresh-all)]
   [clojure.tools.logging :as log]
   [compojure.core :refer (defroutes GET POST ANY)]
   [compojure.route :as route]
   [ring.adapter.jetty9 :as jetty]
   [clojure.repl :refer :all]
   [clojure.pprint :as pp])
  (:gen-class))

(defn handler* [req]
  (let [content (-> req :body slurp)]
    {:status 200
     :headers {"Content-Type" "text/plain"}
     :body (format "The content was %s" content)}))

(defn handler [req]
  (let [{:keys [ uri request-method ]} req]
    {:status 200
     :headers {"Content-Type" "text/plain"}
     :body (format "Your data req  %s %s"
                   (-> request-method
                       name
                       .toUpperCase)
                   uri)}))

(defn stub-req [req]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body (with-out-str (pp/pprint req))})

(defn page-index [req]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body (with-out-str (pp/pprint req))})

(defn page-main [req]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "page-main"})

(defn page-404 [req]
  {:status 404
   :headers {"Content-Type" "text/plain"}
   :body "Page not found"})

;;;(defonce server (atom nil))
;;;(defn start-server []
;;;  (reset! server
;;;         (jetty/run-jetty #'stub-req {:port 8888 :join? false})))
;;;(defn stop-server []
;;;  (when-not (nil? @server)
;;;    (reset! server nil)))

(defn app [req]
  (let [{:keys [uri]} req]
    (case uri
      "/" (page-index req)
      "/zhuzha" (page-main req)
      (page-404 req))))

(defroutes app-route
  (GET "/" req       (handler req))
  (route/not-found "not found"))

;(defonce server (jetty/run-jetty #'handler* {:port 8888  :join? false}))
;(def server (jetty/run-jetty #'app-route {:port 8888  :join? false}))

;;;(.start server)
;;;(.stop server)

(defn -main [& args]
  (jetty/run-jetty #'app {:port 8888 :join? false}))
