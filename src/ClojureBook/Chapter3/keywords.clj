(ns clojure-things.keywords)

; Keywords as access to maps
(def simpleMap {:a 1 :b 2 :c 3})
(:a simpleMap )
(:d simpleMap "Fallback value")

