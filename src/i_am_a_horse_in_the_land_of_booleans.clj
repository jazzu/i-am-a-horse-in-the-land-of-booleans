(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (not (or (nil? x) (not x))))

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [divisor n]
  (== 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond
    (== 0 (mod n 15)) "gotcha!"
    (== 0 (mod n 5)) "buzz"
    (== 0 (mod n 3)) "fizz"
    :else ""))

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else true))

(defn leap-year? [year]
  (or (== 0 (mod year 400))
      (and (== 0 (mod year 4))
           (not (== 0 (mod year 100))))))

; '_______'
