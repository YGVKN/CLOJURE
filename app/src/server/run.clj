(ns server.run
 (:gen-class))


(defn index [req]
 {:status 200
  :headers {"Content-Type" "text/plain"}
  :body "clj app"})
