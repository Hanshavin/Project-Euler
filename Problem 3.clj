; Project Euler
; Problem 3: Largest prime factor
; Language : Clojure
; Code by Hanshavin (@devHanshavin)


(def n (atom 600851475143))
(def i (atom 2))
(def value (atom i))

(while (<= @i (Math/sqrt @n))
	(while (zero? (mod @n @i))
		(swap! n (fn [x] (/ x @i)))
		(swap! value (fn [x] @i)))
	(swap! i inc))
(if (= @n 1) @value @n)