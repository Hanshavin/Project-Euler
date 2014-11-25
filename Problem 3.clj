;; Project Euler
;; Problem 3: Largest prime factor
;; Language : Clojure
;; Code by Hanshavin (@Hanshavin_code)


(defn solve [n, i]
  (if(< (Math/sqrt n) i)
    n
    (#(let[x (mod n i)]
        (cond
         (= x 0) (solve (quot n i) i)
         :else (solve n (inc i)))))))

(solve 600851475143 2)
