
(defn existDivisors [a, n]
  (let[q (Math/sqrt n)]
    (if(> a q)
      false
      (let[r (mod n a)]
        (if(= r 0)
          true
          (existDivisors (inc a) n))))))

(defn isPrime [n] ; n is a prime number without some a, such that: 2 <= a <= sqrt (n), which is divisor of n
  (if(existDivisors 2 n)
    false
    true))

(if(isPrime 17) "17 is prime" "17 is not prime")
(if(isPrime 8) "8 is prime" "8 is not prime")
(if(isPrime 13) "13 is prime" "13 is not prime")
