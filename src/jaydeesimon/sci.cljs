(ns jaydeesimon.sci
  (:require [nextjournal.clerk.sci-env]
            [sci.ctx-store]
            [sci.core :as sci]
            ["@nivo/line" :refer [ResponsiveLine]]
            ["@nivo/treemap" :refer [ResponsiveTreeMap]]))

(sci.ctx-store/swap-ctx!
  sci/merge-opts
  {:classes {'ResponsiveLine ResponsiveLine
             'ResponsiveTreeMap ResponsiveTreeMap}
   :aliases    {'jdsv 'jaydeesimon.viewer}
   :namespaces
   {'jaydeesimon.viewer
    (sci/copy-ns jaydeesimon.viewer (sci/create-ns 'jaydeesimon.viewer))}})
