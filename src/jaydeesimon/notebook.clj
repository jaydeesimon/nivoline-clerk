(ns jaydeesimon.notebook
  (:require [nextjournal.clerk :as clerk]))

(def data
  [{"id" "japan",
    "color" "hsl(221, 70%, 50%)",
    "data" [{"x" "plane", "y" 94}
            {"x" "helicopter", "y" 69}
            {"x" "boat", "y" 151}
            {"x" "train", "y" 161}
            {"x" "subway", "y" 205}
            {"x" "bus", "y" 241}
            {"x" "car", "y" 90}
            {"x" "moto", "y" 195}
            {"x" "bicycle", "y" 155}
            {"x" "horse", "y" 256}
            {"x" "skateboard", "y" 87}
            {"x" "others", "y" 118}]}
   {"id" "france",
    "color" "hsl(42, 70%, 50%)",
    "data" [{"x" "plane", "y" 217}
            {"x" "helicopter", "y" 114}
            {"x" "boat", "y" 7}
            {"x" "train", "y" 294}
            {"x" "subway", "y" 14}
            {"x" "bus", "y" 200}
            {"x" "car", "y" 126}
            {"x" "moto", "y" 147}
            {"x" "bicycle", "y" 84}
            {"x" "horse", "y" 56}
            {"x" "skateboard", "y" 208}
            {"x" "others", "y" 49}]}
   {"id" "us",
    "color" "hsl(95, 70%, 50%)",
    "data" [{"x" "plane", "y" 86}
            {"x" "helicopter", "y" 126}
            {"x" "boat", "y" 293}
            {"x" "train", "y" 5}
            {"x" "subway", "y" 294}
            {"x" "bus", "y" 286}
            {"x" "car", "y" 9}
            {"x" "moto", "y" 237}
            {"x" "bicycle", "y" 285}
            {"x" "horse", "y" 213}
            {"x" "skateboard", "y" 229}
            {"x" "others", "y" 129}]}
   {"id" "germany",
    "color" "hsl(23, 70%, 50%)",
    "data" [{"x" "plane", "y" 162}
            {"x" "helicopter", "y" 202}
            {"x" "boat", "y" 62}
            {"x" "train", "y" 20}
            {"x" "subway", "y" 200}
            {"x" "bus", "y" 41}
            {"x" "car", "y" 249}
            {"x" "moto", "y" 198}
            {"x" "bicycle", "y" 3}
            {"x" "horse", "y" 236}
            {"x" "skateboard", "y" 13}
            {"x" "others", "y" 277}]}
   {"id" "norway",
    "color" "hsl(19, 70%, 50%)",
    "data" [{"x" "plane", "y" 158}
            {"x" "helicopter", "y" 162}
            {"x" "boat", "y" 244}
            {"x" "train", "y" 135}
            {"x" "subway", "y" 291}
            {"x" "bus", "y" 204}
            {"x" "car", "y" 3}
            {"x" "moto", "y" 171}
            {"x" "bicycle", "y" 267}
            {"x" "horse", "y" 281}
            {"x" "skateboard", "y" 268}
            {"x" "others", "y" 218}]}])

(def nivo-line-viewer
  {:transform-fn
   clerk/mark-presented

   :render-fn
   '(fn [data]
      [:div {:style {:height "500px"}}
       [:> ResponsiveLine
        {:data data
         :margin {:top 50 :right 110 :bottom 50 :left 60}
         :xScale {:type "point"}
         :yScale {:type "linear"
                  :min "auto"
                  :max "auto"
                  :stack true
                  :reverse false}
         :yFormat " >-.2f"
         :axisTop nil
         :axisRight nil
         :axisBottom {:orient "bottom"
                      :tickSize 5
                      :tickPadding 5
                      :tickRotation 0
                      :legend "transportation"
                      :legendOffset 36
                      :legendPosition "middle"}
         :pointSize 10
         :useMesh true}]])})

^{::clerk/viewer nivo-line-viewer}
data
