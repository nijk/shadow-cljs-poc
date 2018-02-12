(ns app.main
    (:require
      [reagent.core :as re-agent]
      [app.title :as title]))

(def value-a 1)
(defonce value-b 2)
(defn reload! []
      (println "Code updated.")
      (println "Trying values:" value-a value-b))

(defn page-title []
      [title/title "Foo" "Bar"])

(defn main! []
      (println "App loaded!")
      (reagent/render [page-title]
                (.-body js/document))
      (reload!))

(main!)