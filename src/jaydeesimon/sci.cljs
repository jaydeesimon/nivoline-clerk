(ns jaydeesimon.sci
  (:require [jaydeesimon.viewer]
            [nextjournal.clerk.sci-env]
            [sci.ctx-store]
            [sci.core :as sci]))

(sci.ctx-store/swap-ctx!
  sci/merge-opts
  {:aliases    {'jdsv 'jaydeesimon.viewer}
   :namespaces
   {'jaydeesimon.viewer
    (sci/copy-ns jaydeesimon.viewer (sci/create-ns 'jaydeesimon.viewer))}})
