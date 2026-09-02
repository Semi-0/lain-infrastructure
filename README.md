# propagators-infra

General-purpose propagation infrastructure: cells, messages, immutable networks,
scheduling, IDs, generic procedures, compound data, TMS, GUR, network VM,
standard propagators, and observation primitives.

Public entrypoint: `propagators.infra`. Detailed design notes are in `doc/`.

```sh
clojure -M:test
```

This repository has no dependency on the compiler, runtime, TUI, or research
repositories.
