Trying to get a custom CLJS build happening with my Clerk notebook to see if
I can use @nivo/line as a viewer.

To get going, execute the following forms in `dev/user.clj`:

```
  (require '[mentat.clerk-utils.build :as mentat-clerk])
  (mentat-clerk/serve! {:cljs-namespaces ['jaydeesimon.viewer 'jaydeesimon.sci]})
```
