; Project Euler
; Problem 1: Multiples of 3 and 5
; Language : Clojure
; Code by Hanshavin (@devHanshavin)


; Sum(1 to n)
(defn Sum [n]
	(/ (* n (inc n)) 2)) ; (reduce + (range (inc n))))

; Sum(a° < N)
(defn S [a, N]
	(let [n (quot (dec N) a)] (* a (Sum n))))

; Sum(3° < 1000) + Sum(5° < 1000) - Sum(15° < 1000)
(- (+ (S 3 1000) (S 5 1000)) (S 15 1000))