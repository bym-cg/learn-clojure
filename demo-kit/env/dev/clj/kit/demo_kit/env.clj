(ns kit.demo-kit.env
  (:require
    [clojure.tools.logging :as log]
    [kit.demo-kit.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init       (fn []
                 (log/info "\n-=[kit.demo-kit starting using the development or test profile]=-"))
   :start      (fn []
                 (log/info "\n-=[kit.demo-kit started successfully using the development or test profile]=-"))
   :stop       (fn []
                 (log/info "\n-=[kit.demo-kit has shut down successfully]=-"))
   :middleware wrap-dev
   :opts       {:profile       :dev
                :persist-data? true}})
