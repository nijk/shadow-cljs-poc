(ns app.title)

(defn title [title sub-title]
      [:h1.title title
       (when sub-title [:small (str " " sub-title)])])
