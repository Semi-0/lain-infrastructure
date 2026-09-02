(ns propagators.infra
  "Propagator namespace: re-exports graph and cell primitives from leaf modules."
  (:require [propagators.infra.cells.cell :as cell]
            [propagators.infra.cells.merge :as merge]
            [propagators.infra.cells.snapshot :as snapshot]
            [propagators.infra.cells.value :as value]
            [propagators.infra.graph :as graph]
            [propagators.infra.propagator :as propagator]))

;; Cell
(def make-cell cell/cell)
(def cell? cell/cell?)
(def cell-snapshot snapshot/cell-snapshot)

;; Cell value
(def nothing value/nothing)
(def contradiction value/contradiction)
(def nothing? value/nothing?)
(def contradiction? value/contradiction?)
(def value-payload value/value-payload)

;; Cell merge
(def cell-merge merge/cell-merge)
(def generic-merge merge/generic-merge)
(def cell-strongest merge/strongest-value)
(def cell-equal? merge/cell-equal?)
(def cell-updated? merge/cell-updated?)
(def handle-contradiction merge/handle-contradiction)

;; Propagator
(def ->Propagator propagator/->Propagator)
(def make-propagator propagator/make-propagator)
(def propagator? propagator/propagator?)
(def construct-propagator propagator/construct-propagator)
(def primitive-propagator propagator/primitive-propagator)
(def compound-propagator propagator/compound-propagator)

;; Graph
(def graph? graph/graph?)
(def node? graph/node?)
(def node graph/node)
(def get-node graph/get-node)
(def node-inputs graph/node-inputs)
(def node-outputs graph/node-outputs)
(def link-edge graph/link-edge)
