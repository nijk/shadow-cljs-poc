(ns shadow-js.prod
  (:require
    [shadow-js.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
