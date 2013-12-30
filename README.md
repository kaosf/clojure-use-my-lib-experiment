# clojure-use-my-lib-experiment

An experiment to use [clojure-library-experiment](https://github.com/kaosf/clojure-library-experiment)

## Installation and Usage

### Installation (Download)

Download [clojure-library-experiment](https://github.com/kaosf/clojure-library-experiment) and execute following commands.

```sh
git clone https://github.com/kaosf/clojure-library-experiment
cd clojure-library-experiment
lein install
```

It will be installed in `~/.m2`.

### Usage

Download this repository and then launch REPL to try it.

```sh
git clone https://github.com/kaosf/clojure-use-my-lib-experiment
cd clojure-use-my-lib-experiment
lein repl
```

```clj
(f 1) ;-> 2
(g 2) ;-> 4
```

Or, execute `lein run`. The output should be;

```txt
(f 1) ;-> 2
(g 2) ;-> 4
```

## References

* [leiningen/doc/TUTORIAL.md at stable · technomancy/leiningen](https://github.com/technomancy/leiningen/blob/stable/doc/TUTORIAL.md)
  * [leiningen/doc/TUTORIAL.md at 248362f2e72973eeeab8cb85e8ed1657b751e4fb · technomancy/leiningen](https://github.com/technomancy/leiningen/blob/248362f2e72973eeeab8cb85e8ed1657b751e4fb/doc/TUTORIAL.md) (snapshot on 2013-12-31)
* [Clojureの忘れっぽいrequire、use、import - Starlight](http://d.hatena.ne.jp/Kazuhira/20130913/1379087775)

## License

[MIT](http://opensource.org/licenses/MIT)

Copyright 2013 ka
