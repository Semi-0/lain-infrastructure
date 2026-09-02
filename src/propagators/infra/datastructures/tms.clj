(ns propagators.infra.datastructures.tms
  "Compatibility facade for TMS datastructure namespaces.

  Legacy ordinary TMS output cells are not retracted; TMS-aware consumers
  should inspect the strongest TMS view."
  (:require [propagators.infra.datastructures.tms.core]))

(doseq [[sym v] (ns-publics 'propagators.infra.datastructures.tms.core)]
  (intern *ns* sym @v))
