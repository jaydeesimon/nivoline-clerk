(ns user)

(comment
  
  (require '[mentat.clerk-utils.build :as mentat-clerk])
  (mentat-clerk/serve! {:cljs-namespaces ['jaydeesimon.viewer]})
  
  
  (mentat-clerk/halt!)


  ; The usual way to start up Clerk
  ;(require '[nextjournal.clerk :as clerk])
  ;(clerk/serve! {:browse? false})
  ;(clerk/halt!)
  ;(clerk/clear-cache!)
  
  
  
  
  
  )
