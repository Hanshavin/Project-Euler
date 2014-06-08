; Project Euler
; Problem 6: Sum square difference
; Language : Clojure
; Code by Hanshavin (@devHanshavin)


(let [a (range 1 101)]
	(- 
		(let [sum (reduce + a)] (* sum sum)) ; sum(n) = n*(n+1)/2
		(reduce + (map #(* % %) a)))) ; sumSquare(n) = n*(n+1)(2*n+1)/6