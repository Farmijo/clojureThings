(ns clojure-things.mappings)

; defining maps
(def nameMap {:first-name "Charlie"
              :last-name "McFishwich"})
(def nameMapOtherWay (hash-map :first-name "Charlie" :last-name "Bucket"))
(def nestedMap {:no-nest "uno" :nest {:nested-element "dos "}})

; Accessing to maps
(defn doStuff []
  (println (get nameMap :first-name "no-value"))
  (println (get nameMapOtherWay :first-name)))

(doStuff)

; Accessing nested maps
(get-in nestedMap [:nest :nested-element])

; Accessing map as function

(nameMap :first-name)

