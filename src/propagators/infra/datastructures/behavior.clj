(ns propagators.infra.datastructures.behavior
  "Compatibility facade for behavior datastructure namespaces."
  (:require [propagators.infra.datastructures.behavior.core]))

(doseq [[sym v] (ns-publics 'propagators.infra.datastructures.behavior.core)]
  (intern *ns* sym @v))
