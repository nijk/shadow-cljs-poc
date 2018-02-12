(ns app.title)

(defn title [copy]
      [:h1 (str copy)])

      ;(sab/html [:div
      ;           [:h1.title title
      ;            (when sub-title [:small sub-title])]]))