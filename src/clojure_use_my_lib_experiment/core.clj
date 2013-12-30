(ns clojure-use-my-lib-experiment.core
  (:gen-class)
  (:require [clojure-library-experiment.core :refer :all]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (str "(f 1) ;-> " (f 1)))
  (println (str "(g 2) ;-> " (g 2))))
