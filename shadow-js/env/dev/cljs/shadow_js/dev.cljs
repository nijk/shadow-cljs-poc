(ns ^:figwheel-no-load shadow-js.dev
  (:require
    [shadow-js.core :as core]
    [devtools.core :as devtools]))


(enable-console-print!)

(devtools/install!)

(core/init!)
