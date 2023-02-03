(ns jaydeesimon.sci
  (:require [nextjournal.clerk.sci-env]
            [sci.ctx-store]
            [sci.core :as sci]
            ["@nivo/line" :refer [ResponsiveLine]]))

(sci.ctx-store/swap-ctx!
  sci/merge-opts
  {:classes {'ResponsiveLine ResponsiveLine}
   :aliases    {'jdsv 'jaydeesimon.viewer}
   :namespaces
   {'jaydeesimon.viewer
    (sci/copy-ns jaydeesimon.viewer (sci/create-ns 'jaydeesimon.viewer))}})
