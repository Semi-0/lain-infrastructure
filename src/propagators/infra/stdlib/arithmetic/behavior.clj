(ns propagators.infra.stdlib.arithmetic.behavior
  "Compatibility facade for behavior arithmetic."
  (:refer-clojure :exclude [+ - * /])
  (:require [propagators.infra.datastructures.behavior.arithmetic]))

(doseq [[sym v] (ns-publics 'propagators.infra.datastructures.behavior.arithmetic)]
  (intern *ns* sym @v))
