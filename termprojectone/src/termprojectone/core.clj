(ns termprojectone.core
  (:gen-class))

"this is written in a docstring >> this is a function in clojure. 
   repl is the function's name and the brackets indicate arguments. 
   repl takes no arguments, so the brackets are empty."
(defn repl [] ;; two semi-colons begins a comment 
  (while true ;; a simple way of creating an infinite loop in clojure
    (println "type something:") ;; one way of printing in clojure
    (let [inp (read-line)] ;; binding user input to the name inp
      (if (= inp "something") ;; this is how if statements are formatted
        (println "wow that is hilarious") ;; if condition is true, this line executes
        (println "you just typed" inp)))) ;; this is an optional else statement
  ) 
"the main function calls repl"
(defn -main 
  []
  (repl) ;; the first thing inside a set of parentheses is the function, the rest are args
  )

;; Source: https://www.educative.io/answers/the-while-loop-in-clojure
;; Source: https://www.braveclojure.com/