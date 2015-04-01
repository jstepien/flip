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
