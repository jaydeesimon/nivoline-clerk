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

(def treemap-data
  {"name" "nivo",
   "color" "hsl(127, 70%, 50%)",
   "children" [{"name" "viz",
                "color" "hsl(8, 70%, 50%)",
                "children" [{"name" "stack",
                             "color" "hsl(331, 70%, 50%)",
                             "children" [{"name" "cchart", "color" "hsl(94, 70%, 50%)", "loc" 181395}
                                         {"name" "xAxis", "color" "hsl(117, 70%, 50%)", "loc" 51135}
                                         {"name" "yAxis", "color" "hsl(349, 70%, 50%)", "loc" 25321}
                                         {"name" "layers", "color" "hsl(346, 70%, 50%)", "loc" 111628}]}
                            {"name" "ppie",
                             "color" "hsl(176, 70%, 50%)",
                             "children" [{"name" "chart",
                                          "color" "hsl(324, 70%, 50%)",
                                          "children" [{"name" "pie",
                                                       "color" "hsl(252, 70%, 50%)",
                                                       "children" [{"name" "outline",
                                                                    "color" "hsl(17, 70%, 50%)",
                                                                    "loc" 94561}
                                                                   {"name" "slices",
                                                                    "color" "hsl(251, 70%, 50%)",
                                                                    "loc" 10191}
                                                                   {"name" "bbox",
                                                                    "color" "hsl(43, 70%, 50%)",
                                                                    "loc" 146391}]}
                                                      {"name" "donut", "color" "hsl(191, 70%, 50%)", "loc" 139487}
                                                      {"name" "gauge", "color" "hsl(259, 70%, 50%)", "loc" 143980}]}
                                         {"name" "legends", "color" "hsl(178, 70%, 50%)", "loc" 138365}]}]}
               {"name" "colors",
                "color" "hsl(281, 70%, 50%)",
                "children" [{"name" "rgb", "color" "hsl(187, 70%, 50%)", "loc" 12524}
                            {"name" "hsl", "color" "hsl(191, 70%, 50%)", "loc" 105477}]}
               {"name" "utils",
                "color" "hsl(33, 70%, 50%)",
                "children" [{"name" "randomize", "color" "hsl(6, 70%, 50%)", "loc" 28885}
                            {"name" "resetClock", "color" "hsl(337, 70%, 50%)", "loc" 132905}
                            {"name" "noop", "color" "hsl(4, 70%, 50%)", "loc" 111644}
                            {"name" "tick", "color" "hsl(60, 70%, 50%)", "loc" 85737}
                            {"name" "forceGC", "color" "hsl(289, 70%, 50%)", "loc" 59363}
                            {"name" "stackTrace", "color" "hsl(99, 70%, 50%)", "loc" 175100}
                            {"name" "dbg", "color" "hsl(9, 70%, 50%)", "loc" 174336}]}
               {"name" "generators",
                "color" "hsl(104, 70%, 50%)",
                "children" [{"name" "address", "color" "hsl(155, 70%, 50%)", "loc" 70514}
                            {"name" "city", "color" "hsl(59, 70%, 50%)", "loc" 141030}
                            {"name" "animal", "color" "hsl(78, 70%, 50%)", "loc" 198200}
                            {"name" "movie", "color" "hsl(29, 70%, 50%)", "loc" 94141}
                            {"name" "user", "color" "hsl(304, 70%, 50%)", "loc" 186445}]}
               {"name" "set",
                "color" "hsl(85, 70%, 50%)",
                "children" [{"name" "clone", "color" "hsl(53, 70%, 50%)", "loc" 59643}
                            {"name" "intersect", "color" "hsl(184, 70%, 50%)", "loc" 10830}
                            {"name" "merge", "color" "hsl(99, 70%, 50%)", "loc" 175481}
                            {"name" "reverse", "color" "hsl(126, 70%, 50%)", "loc" 11160}
                            {"name" "toArray", "color" "hsl(122, 70%, 50%)", "loc" 173937}
                            {"name" "toObject", "color" "hsl(23, 70%, 50%)", "loc" 112551}
                            {"name" "fromCSV", "color" "hsl(95, 70%, 50%)", "loc" 109801}
                            {"name" "slice", "color" "hsl(173, 70%, 50%)", "loc" 111379}
                            {"name" "append", "color" "hsl(328, 70%, 50%)", "loc" 14034}
                            {"name" "prepend", "color" "hsl(317, 70%, 50%)", "loc" 1314}
                            {"name" "shuffle", "color" "hsl(132, 70%, 50%)", "loc" 162204}
                            {"name" "pick", "color" "hsl(71, 70%, 50%)", "loc" 180179}
                            {"name" "plouc", "color" "hsl(348, 70%, 50%)", "loc" 15984}]}
               {"name" "text",
                "color" "hsl(277, 70%, 50%)",
                "children" [{"name" "trim", "color" "hsl(103, 70%, 50%)", "loc" 57696}
                            {"name" "slugify", "color" "hsl(69, 70%, 50%)", "loc" 61721}
                            {"name" "snakeCase", "color" "hsl(100, 70%, 50%)", "loc" 6177}
                            {"name" "camelCase", "color" "hsl(97, 70%, 50%)", "loc" 151768}
                            {"name" "repeat", "color" "hsl(174, 70%, 50%)", "loc" 12440}
                            {"name" "padLeft", "color" "hsl(90, 70%, 50%)", "loc" 120501}
                            {"name" "padRight", "color" "hsl(130, 70%, 50%)", "loc" 68457}
                            {"name" "sanitize", "color" "hsl(292, 70%, 50%)", "loc" 30122}
                            {"name" "ploucify", "color" "hsl(41, 70%, 50%)", "loc" 14653}]}
               {"name" "misc",
                "color" "hsl(29, 70%, 50%)",
                "children" [{"name" "greetings",
                             "color" "hsl(40, 70%, 50%)",
                             "children" [{"name" "hey", "color" "hsl(220, 70%, 50%)", "loc" 52310}
                                         {"name" "HOWDY", "color" "hsl(149, 70%, 50%)", "loc" 114572}
                                         {"name" "aloha", "color" "hsl(281, 70%, 50%)", "loc" 6780}
                                         {"name" "AHOY", "color" "hsl(148, 70%, 50%)", "loc" 156815}]}
                            {"name" "other", "color" "hsl(162, 70%, 50%)", "loc" 122175}
                            {"name" "path",
                             "color" "hsl(144, 70%, 50%)",
                             "children" [{"name" "pathA", "color" "hsl(327, 70%, 50%)", "loc" 37921}
                                         {"name" "pathB",
                                          "color" "hsl(179, 70%, 50%)",
                                          "children" [{"name" "pathB1", "color" "hsl(291, 70%, 50%)", "loc" 58803}
                                                      {"name" "pathB2", "color" "hsl(226, 70%, 50%)", "loc" 114065}
                                                      {"name" "pathB3", "color" "hsl(97, 70%, 50%)", "loc" 21679}
                                                      {"name" "pathB4", "color" "hsl(226, 70%, 50%)", "loc" 101162}]}
                                         {"name" "pathC",
                                          "color" "hsl(216, 70%, 50%)",
                                          "children" [{"name" "pathC1", "color" "hsl(141, 70%, 50%)", "loc" 172006}
                                                      {"name" "pathC2", "color" "hsl(10, 70%, 50%)", "loc" 146849}
                                                      {"name" "pathC3", "color" "hsl(279, 70%, 50%)", "loc" 169564}
                                                      {"name" "pathC4", "color" "hsl(220, 70%, 50%)", "loc" 143465}
                                                      {"name" "pathC5", "color" "hsl(169, 70%, 50%)", "loc" 148282}
                                                      {"name" "pathC6", "color" "hsl(321, 70%, 50%)", "loc" 140704}
                                                      {"name" "pathC7", "color" "hsl(319, 70%, 50%)", "loc" 1025}
                                                      {"name" "pathC8", "color" "hsl(135, 70%, 50%)", "loc" 70500}
                                                      {"name" "pathC9", "color" "hsl(250, 70%, 50%)", "loc" 198042}]}]}]}]})

(def nivo-treemap-viewer
  {:transform-fn
   clerk/mark-presented
   
   :render-fn
   '(fn [data]
      [:div {:style {:height "500px"}}
       [:> ResponsiveTreeMap
        {:data data
         :identity "name"
         :value "loc"
         :valueFormat ".02s"
         :margin {:top 10 :right 10 :bottom 10 :left 10}
         :labelSkipSize 12
         :labelTextColor {:from "color" :modifiers [["darker" 1.2]]}
         :parentLabelPosition "left"
         :parentLabelTextColor {:from "color" :modifiers [["darker" 2]]}
         :borderColor {:from "color" :modifiers [["darker" 0.1]]}}]])})

^{::clerk/viewer nivo-line-viewer}
data

^{::clerk/viewer nivo-treemap-viewer}
treemap-data
