(ns propagators.infra.gur-test
  (:require [clojure.test :refer [deftest is]]
            [propagators.infra.gur :as gur]
            [propagators.infra.gur.flat :as flat]))

(deftest public-gur-facade-delegates-to-flat-gur
  (is (identical? flat/recursive-declaration
                  gur/recursive-declaration))
  (is (identical? flat/apply-closure-effect
                  gur/apply-closure-effect))
  (is (identical? flat/when-effect
                  gur/when-effect)))

(deftest accumulating-only-operations-are-not-public-defaults
  (is (nil? (ns-resolve 'propagators.infra.gur
                        'p:accumulate-apply-closure)))
  (is (nil? (ns-resolve 'propagators.infra.gur
                        'p:run-accumulated-network))))
