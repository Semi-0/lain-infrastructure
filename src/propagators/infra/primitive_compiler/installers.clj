(ns propagators.infra.primitive-compiler.installers)

(defn default-installers
  "Installer map (lazy resolve avoids compiler <-> stdlib cycles)."
  []
  {'prop/id (requiring-resolve 'propagators.infra.stdlib.prop/id)
   'p:id (requiring-resolve 'propagators.infra.stdlib.prop/id)
   'prop/+ (requiring-resolve 'propagators.infra.stdlib.prop/+)
   'prop/- (requiring-resolve 'propagators.infra.stdlib.prop/-)
   'prop/* (requiring-resolve 'propagators.infra.stdlib.prop/*)
   'prop// (requiring-resolve 'propagators.infra.stdlib.prop//)
   'prop/quot (requiring-resolve 'propagators.infra.stdlib.prop/quot)
   'prop/<= (requiring-resolve 'propagators.infra.stdlib.prop/<=)
   'prop/not (requiring-resolve 'propagators.infra.stdlib.prop/not)
   'prop/and (requiring-resolve 'propagators.infra.stdlib.prop/and)
   'prop/or (requiring-resolve 'propagators.infra.stdlib.prop/or)
   'prop/nothing? (requiring-resolve 'propagators.infra.stdlib.prop/nothing?)
   'prop/switch (requiring-resolve 'propagators.infra.stdlib.prop/switch)
   'prop/when (requiring-resolve 'propagators.infra.stdlib.prop/when)
   'scope-source/p:scope-value
   (requiring-resolve 'propagators.infra.datastructures.scope-source/p:scope-value)
   'closure/p:apply-closure (requiring-resolve 'propagators.infra.closure/p:apply-closure)
   'closure/p:apply-network (requiring-resolve 'propagators.infra.closure/p:apply-network)
   'closure/p:when-network (requiring-resolve 'propagators.infra.closure/p:when-network)
   'closure/p:when-apply-network (requiring-resolve 'propagators.infra.closure/p:when-apply-network)
   'closure/p:bind-network (requiring-resolve 'propagators.infra.closure/p:bind-network)
   'cursor/p:car (requiring-resolve 'propagators.infra.deprecated.cursor/p:car)
   'cursor/p:cdr (requiring-resolve 'propagators.infra.deprecated.cursor/p:cdr)
   'obj/p:slot (requiring-resolve 'propagators.infra.datastructures.compound-object/p:slot)
   'obj/p:slot-cursor (requiring-resolve 'propagators.infra.datastructures.compound-object/p:slot-cursor)
   'decl/reduce-cursor (requiring-resolve 'propagators.infra.declaration/reduce-cursor)
   'decl/reduce-slots (requiring-resolve 'propagators.infra.declaration/reduce-slots)
   'recursive/p:recursive-compound
   (requiring-resolve 'propagators.infra.gur.recursive/p:recursive-compound)
   'recursive/p:self-refining-recursive-compound
   (requiring-resolve 'propagators.infra.gur.recursive/p:self-refining-recursive-compound)
   'recursive/p:accumulating-recursive-compound
   (requiring-resolve 'propagators.infra.gur.recursive/p:accumulating-recursive-compound)})
