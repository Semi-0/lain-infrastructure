(ns as-messages
  (:require [propagators.infra.cells.cell :as cell]
            [propagators.infra.cells.snapshot :refer [snap-cell snap-id]]
            [propagators.infra.message :refer [message]]
            [propagators.infra.graph :as g]))

(defn strongest-from-snapshot [snap]
  (cell/cell-strongest (snap-cell snap)))

(defn as-messages [output-node-ids vals]
  (let [ids (mapv g/node-id output-node-ids)]
    (when (not= (count ids) (count vals))
      (throw (ex-info "output count mismatch"
                      {:outputs (count ids) :results (count vals)})))
    (mapv #(message %1 %2) ids vals)))
