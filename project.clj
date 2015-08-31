(defproject org.clojure/algo.generic "0.1.2"
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :source-paths ["src" "src/main/clojure"]
  :test-paths ["test" "src/test/clojure"]
  :target-path "target/%s"
  :profiles {:shared {:dependencies [[org.clojure/tools.nrepl "0.2.10"]]}
             :1.0 [:shared {:dependencies [[org.clojure/clojure "1.0"]]}]
             :1.1 [:shared {:dependencies [[org.clojure/clojure "1.1.0"]]}]
             :1.2 [:shared {:dependencies [[org.clojure/clojure "1.2.1"]]}]
             :1.3 [:shared {:dependencies [[org.clojure/clojure "1.3.0"]]}]
             :1.4 [:shared {:dependencies [[org.clojure/clojure "1.4.0"]]}]
             :1.5 [:shared {:dependencies [[org.clojure/clojure "1.5.1"]]}]
             :1.6 [:shared {:dependencies [[org.clojure/clojure "1.6.0"]]}]})
