;; Project Euler
;; Problem 1: Multiples of 3 and 5
;; Language : Clojure
;; Code by Hanshavin (@Hanshavin_code)


;; Sum(1 to n) : n * (n+1) / 2
(defn Sum [n]
  (/ (* n (inc n)) 2)) ; (reduce + (range (inc n))))

;; Sum(a° < N) : a * Sum(1 (N/a))
(defn S [a, N]
  (let [n (quot (dec N) a)] (* a (Sum n))))

;; Sum(3° < 1000) + Sum(5° < 1000) - Sum(15° < 1000)
(- (+ (S 3 1000) (S 5 1000)) (S 15 1000))
