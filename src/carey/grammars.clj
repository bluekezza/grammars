(ns carey.grammars
  (:require [clojure.core.typed :refer [defalias ann]]
            [clojure.java.io :as io])
  (:import [java.io File]))

(ann ^:no-check clojure.java.io/resource [String -> java.net.URL])

(ann ^:no-check clojure.java.io/file [java.net.URL -> File])

(ann mkvmerge File)
(def mkvmerge
  (-> "mkvmerge" io/resource io/file))

(ann mediainfo File)
(def mediainfo
  (-> "mediainfo" io/resource io/file))
