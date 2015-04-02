(ns ╯°□°╯-test
  (:require [clojure.test :refer :all]
            [╯°□°╯ :refer :all]))

(deftest ╯°□°╯-test
  (is (thrown-with-msg?
        Exception #"^┻━┻$"
        (╯°□°╯ (ex-info "┻━┻" {})))))

(deftest ╯°□°╯︵oɟuᴉ-test
  (is (thrown-with-msg?
        Exception #"^╯°□°╯$"
        (╯°□°╯︵oɟuᴉ {}))))

(deftest v°□°v-test
  (is (= (v°□°v (/ 1 0) (┬─┬ ╯°_°╯ Exception "caught"))
         "caught"))

  (is (= (v°□°v (/ 1 0) (┬─┬ ╯°_°╯ Exception (type ┬─┬)))
         java.lang.ArithmeticException)))
