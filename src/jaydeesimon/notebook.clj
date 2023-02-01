(ns jaydeesimon.notebook
  (:require [nextjournal.clerk :as clerk]))

(+ 1 2 3 4 5)

(def my-viewer
  {:transform-fn
   clerk/mark-presented
   
   :render-fn
   '(fn [data]
      (let [added (jdsv/add (:x data) (:y data))]
        [:h1 added]))})

;; These will be added up!
^{::clerk/viewer my-viewer}
{:x 50 :y 50}
