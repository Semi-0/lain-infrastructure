(ns propagators.infra.datastructures.tms.distributed
  "Distributed TMS compatibility surface."
  (:require [propagators.infra.datastructures.tms.core]))

(doseq [[sym v] (ns-publics 'propagators.infra.datastructures.tms.core)]
  (intern *ns* sym @v))
