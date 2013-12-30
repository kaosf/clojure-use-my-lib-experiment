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

## License

[MIT](http://opensource.org/licenses/MIT)

Copyright 2013 ka
