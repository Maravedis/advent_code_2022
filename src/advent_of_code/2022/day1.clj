(ns advent-of-code.2022.day1
  (:require [advent-of-code.utils :refer [read-file-segmented-list]]))
  

(defn most-calories [resource]
  (->> (read-file-segmented-list resource)
       (map (partial reduce +))
       (apply max)))

(defn top3-calories [resource]
  (->> (read-file-segmented-list resource)
       (map (partial reduce +))
       (sort >)
       (take 3)
       (apply +)))

(comment
  (most-calories "2022/day1")
  (top3-calories "2022/day1")
  )
