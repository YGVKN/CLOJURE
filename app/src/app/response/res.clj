(ns app.response.res
  (:require [ring.util.response :refer [response charset content-type not-found]]))

(defn info-req [req]
  (response (str req)))

(defn page-not-found [req]
  (not-found (str "Page not found")))

(defn index [req]
  (ring.util.response/resource-response "index.html" {:root "public/static_pages"}))

(defn handler [req]
  (response (str req)))

(comment
  (defn handler [req])
 (charset
   (content-type
     (response
       (str "<h3>uri</h3>"
            (:uri req)))"text/html")"utf-8"))



;;(defn handler [req]
 ;; (res/charset
  ;;  (res/content-type
  ;;;; ;;   (res/response (str req)) "text/html") "utf-8"))

 ;;(defn route [req]
 ;; (if (= "/" (:uri req))
  ;;  (res/charset (res/content-type (res/response (str "<h4>index</h4>")) "text/html")"utf-8")
  ;;  (res/charset (res/content-type (res/resource-response "404.html" {:root "public"})"text/html")"utf-8")))
;;;(defn -main [port]
; ;; (jetty/run-jetty route
;;  ;;  {:port (Integer. port)}))
