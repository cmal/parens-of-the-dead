(defproject parens-of-the-dead "0.1.0-SNAPSHOT"
  :description "A series of zombie-themed games written with Clojure and ClojureScript"
  :url "http://www.parens-of-the-dead.com"
  :license {:name "GNU General Public License"
            :url  "http://www.gnu.org/licenses/gpl.html"}
  :main undead.system
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.562"]
                 [com.stuartsierra/component "0.3.2"]
                 [http-kit "2.2.0"]
                 [compojure "1.6.0"]
                 ]
  :plugins [[lein-figwheel "0.5.10"]]
  :figwheel {:server-port 3450
             }
  :cljsbuild {:builds [{:id           "dev"
                        :source-paths ["src" "dev"]
                        :figwheel     true
                        :compiler     {:main                 "undead.client"
                                       :asset-path           "/out"
                                       :output-to            "target/classes/public/app.js"
                                       :output-dir           "target/classes/public/out"
                                       :optimizations        :none
                                       :recompile-dependents true
                                       :source-map           true}}]}
  :profiles {:dev {:plugins      [[lein-cljsbuild "1.1.6"]
                                  ]
                   :dependencies [[reloaded.repl "0.2.3"]]
                   :source-paths ["dev"]
                   }
             }
  )
