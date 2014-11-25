;; Project Euler
;; Problem 5: Smallest multiple
;; Language : Clojure
;; Code by Hanshavin (@Hanshavin_code)


;; Maximum common divisor
(defn gcd [a b]
  (if(zero? b) a (gcd b (mod a b)))) ; euclidean algorithm

;; Least common multiple
(defn lcm [a b]
  (/ (* a b) (gcd a b)))

(reduce lcm (range 1 21))
