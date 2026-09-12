# Flat GUR Default

Status: current architecture, 2026-09-12.

`propagators.infra.gur` is the public flat-GUR facade. Recursive declarations
emit bounded, stable declaration effects into the active immutable `Net`.
`propagators.infra.gur.accumulating` remains available as an explicit
alternative when a program requires an accumulated child-network value.

The public flat surface exports recursive closure values, recursive
declarations, stable node identities, application effects, availability
effects, and the flat VM declarations used by compiler clients.

`propagators.infra.install` is the pointfree authoring surface. Its
`when-named` combinator gives a lazy availability branch a semantic identity:

```clojure
(-> context
    (i/when-named :local-binding
                  :local-present
                  local-binding)
    (i/when-named :parent-frame
                  :local-missing
                  parent-binding))
```

The availability effect waits when the condition is `nothing` or a
contradiction. Once usable, it declares the named body exactly once. The
existing positional `when` API delegates to `when-named` with an
effect-position role for compatibility.

Compiler-specific application and lexical policy stays outside this
repository. Compiler code composes these public declarations; flat GUR does not
depend on the compiler.
