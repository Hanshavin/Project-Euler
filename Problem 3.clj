; Project Euler
; Problem 3: Largest prime factor
; Language : Clojure
; Code by Hanshavin (@devHanshavin)


(defn solve [n, i]
	(if(< (Math/sqrt n) i)
		n
		(#(let[x (mod n i)]
			(cond
				(= x 0) (solve (long(/ n i)) i)
				:else (solve n (inc i)))))))

(solve 600851475143 2)

; (def n (atom 600851475143))
; (def i (atom 2))
; (def value (atom i))

; (while (<= @i (Math/sqrt @n))
; 	(while (zero? (mod @n @i))
; 		(swap! n (fn [x] (/ x @i)))
; 		(swap! value (fn [x] @i)))
; 	(swap! i inc))
; (if (= @n 1) @value @n)