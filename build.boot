(set-env!
  :dependencies '[[org.clojure/clojurescript "1.9.293"]
                  [adzerk/boot-cljs          "1.7.228-2"]
                  [adzerk/boot-reload        "0.4.13"]
                  [compojure                 "1.6.0-beta2"]
                  [hoplon/hoplon             "6.0.0-alpha17"]
                  [hoplon/castra             "3.0.0-alpha7"]
                  [tailrecursion/boot-jetty  "0.1.3"]
                  [ring                      "1.6.0-beta6"]
                  [ring/ring-defaults        "0.3.0-beta1"]
                  [onetom/boot-lein-generate "0.1.3" :scope "test"]]
  :resource-paths #{"resources" "src/clj"}
  :source-paths   #{"src/cljs" "src/hl"})

(require
  '[adzerk.boot-cljs            :refer [cljs]]
  '[adzerk.boot-reload          :refer [reload]]
  '[hoplon.boot-hoplon          :refer [hoplon prerender]]
  '[tailrecursion.boot-jetty    :refer [serve]]
  'boot.lein)

(boot.lein/generate)

(deftask dev
  "Build project for local development."
  []
  (comp
    (watch)
    (speak :theme "woodblock")
    (hoplon)
    (reload)
    (cljs)
    (web :serve 'monty-hall.handler/app)
    (serve :port 8000)))

(deftask prod
  "Build project for production deployment."
  []
  (comp
    (hoplon)
    (cljs :optimizations :advanced)
    (prerender)))

(deftask make-war
  "Build a war for deployment"
  []
  (comp (hoplon)
        (cljs :optimizations :advanced)
        (uber :as-jars true)
        (web :serve 'monty-hall.handler/app)
        (war)
        (target :dir #{"target"})))
