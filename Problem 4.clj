;; Project Euler
;; Problem 4: Largest palindrome product
;; Language : Clojure
;; Code by Hanshavin (@Hanshavin_code)


(defn tam [n]
  (cond
   (< n 10) 1
   :else (+ 1 (tam (quot n 10)))))

(defn inv [n]
  (cond
   (< n 10) n
   :else (let [c (tam n)] (+ (* (mod n 10) (reduce * (repeat (dec c) 10))) (inv (quot n 10))))))

(defn isCapicua [n]
  (= n (inv n)))

(defn filterCapicuas [a]
  (filter isCapicua a))

(defn Prod [a]
  (cond
   (= (count a) 1) [(* (first a) (first a))]
   :else (let[x (first a)] ( vec(concat (map #(* x %) a) (multi (rest a))) ))))

(apply max (vec(filterCapicuas (Prod (range 100 1000)))))
