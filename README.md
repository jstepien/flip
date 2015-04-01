# ╯°□°╯

![╯°□°╯](https://i.imgur.com/7uxZtq7.jpg)

When `throw` is not enough.
[![Build Status](https://travis-ci.org/jstepien/flip.svg)][travis]

[travis]: https://travis-ci.org/jstepien/flip

## Usage

```clojure
;; Throw whatever you like.
(let [┻━┻ (Exception.)]
  (╯°□°╯ ┻━┻))

;; Throw an ex-info exception.
(╯°□°╯︵oɟuᴉ {:some {:extra :data}})
```

There's no artifact on Clojars¹ but it doesn't matter because you can simply
[copypasta the entire source code to your own project][src].

[src]: https://github.com/jstepien/flip/blob/master/src/%E2%95%AF%C2%B0%E2%96%A1%C2%B0%E2%95%AF.clj

## Is it any good?

Yes.

  - [Bare meta][meta] speed!
  - Native look and feel!
  - Tested up to Clojure 1.7.0-α6!
  - Known production applications²!
  - Compatible with Stuart Sierra's Component!

[meta]: https://twitter.com/thejayfields/status/572837627927371777

## License

Copyright © 2015 Jan Stępień

Distributed under the MIT License.

---

¹ It might be related to ╯°□°╯ not being a legal artifact name.

² Early adopters asked to remain anonymous.
