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

### Usage

Download this repository and then launch REPL to try it.

```sh
git clone https://github.com/kaosf/clojure-use-my-lib-experiment
cd clojure-use-my-lib-experiment
lein repl
```

```clj
(require 'clojure-library-experiment.core)

(clojure-library-experiment.core/f 1) ;-> 2
(clojure-library-experiment.core/g 2) ;-> 4
```

```clj
(require [clojure-library-experiment.core :refer :all])

(f 1) ;-> 2
(g 2) ;-> 4
```

## License

[MIT](http://opensource.org/licenses/MIT)

Copyright 2013 ka
