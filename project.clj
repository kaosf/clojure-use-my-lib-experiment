(defproject clojure-use-my-lib-experiment "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :main ^:skip-aot clojure-use-my-lib-experiment.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
