(defproject clojure-genetic-algorithm-example "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0-beta2"]
                 [org.clojure/core.async "0.1.267.0-0d7780-alpha"]
                 [org.clojure/math.numeric-tower "0.0.3"]
                 [org.clojure/algo.generic "0.1.1"]
                 [net.mikera/core.matrix "0.19.0"]]
  :main ^:skip-aot clojure-genetic-algorithm-example.clj.core
  :jvm-opts ^:replace ["-server"]
  :java-source-paths ["src/clojure-genetic-algorithm-example/java"]
  :profiles {:dev {:dependencies [[criterium "0.4.2"]
                                  [midje "1.6.0"]]
                   :plugins      [[lein-midje "3.1.1"]]}})
