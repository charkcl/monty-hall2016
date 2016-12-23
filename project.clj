(defproject
  boot-project
  "0.0.0-SNAPSHOT"
  :repositories
  [["clojars" {:url "https://repo.clojars.org/"}]
   ["maven-central" {:url "https://repo1.maven.org/maven2"}]]
  :dependencies
  [[org.clojure/clojurescript "1.9.293"]
   [adzerk/boot-cljs "1.7.228-2"]
   [adzerk/boot-reload "0.4.13"]
   [compojure "1.6.0-beta2"]
   [hoplon "6.0.0-alpha17"]
   [hoplon/castra "3.0.0-alpha7"]
   [tailrecursion/boot-jetty "0.1.3"]
   [ring "1.6.0-beta6"]
   [ring/ring-defaults "0.3.0-beta1"]
   [onetom/boot-lein-generate "0.1.3" :scope "test"]]
  :source-paths
  ["src/hl" "src/cljs"]
  :resource-paths
  ["src/clj" "resources"]
  :uberjar-name "monty-hall2016.jar")