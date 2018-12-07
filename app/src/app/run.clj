(ns app.run
  (:require [ring.adapter.jetty :refer [run-jetty]]
            [app.routes :as route]))

(defn -main [port]
 (run-jetty route/app {:port (Integer. port)}))
