; Project Euler
; Problem 2: Even Fibonacci numbers
; Language : Clojure
; Code by Hanshavin (@devHanshavin)


; Sum of even elements
(defn EvenSum [numbers]
	(reduce + (filter even? numbers)))

; Fibonacci: a, b, a+b, ... inf
(defn fibo [a b]
	(cons a (lazy-seq(fibo b (+ a b)))))

(EvenSum (take-while (partial > 4000000) (fibo 1 1))) ; partial: (> 4000000 (fibo 1 1))