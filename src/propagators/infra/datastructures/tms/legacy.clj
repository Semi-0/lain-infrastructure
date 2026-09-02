(ns propagators.infra.datastructures.tms.legacy
  "Legacy centralized reducer-cell TMS compatibility surface."
  (:require [propagators.infra.datastructures.tms.core]))

(doseq [[sym v] (ns-publics 'propagators.infra.datastructures.tms.core)]
  (intern *ns* sym @v))
