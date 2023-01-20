(ns kit.demo-kit.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init       (fn []
                 (log/info "\n-=[kit.demo-kit starting]=-"))
   :start      (fn []
                 (log/info "\n-=[kit.demo-kit started successfully]=-"))
   :stop       (fn []
                 (log/info "\n-=[kit.demo-kit has shut down successfully]=-"))
   :middleware (fn [handler _] handler)
   :opts       {:profile :prod}})
