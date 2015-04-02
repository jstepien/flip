(ns ╯°□°╯)

(defn ╯°□°╯
  "A shorthand for throw."
  [throwable]
  (throw throwable))

(defmacro v°□°v
  [& body]
  (loop [new-body `(try)
         [current-form & forms] body]
    (if current-form
      (if (= (second current-form) '╯°_°╯)
        (let [[old-first old-second old-third & others] current-form]
          (recur (concat new-body (list `(catch ~old-third ~old-first ~@others)))
                 forms))
        (recur (concat new-body `(~current-form))
               forms))
      new-body)))

(defn ╯°□°╯︵oɟuᴉ
  "A shorthand for ╯°□°╯ with ex-info."
  ([map]
   (╯°□°╯ (ex-info "╯°□°╯" map)))
  ([map cause]
   (╯°□°╯ (ex-info "╯°□°╯" map cause))))
