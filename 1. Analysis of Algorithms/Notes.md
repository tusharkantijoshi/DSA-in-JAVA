<!--
!1. Introduction to Data Structures
* A data structure is a particular way of organizing data in a computer so that it can be used effectively. The idea is to reduce the space and time complexities of different tasks.

? Types of data structures
* 1. Primitive
* 2. Non Primitive

? Types of Primitive
* byte
* short
* int
* long
* float
* double
* boolean
* char

? Types of Non Primitive
* 1. Linear
* 2. Non Linear

? Types of Linear
* 1. Static -> Array
* 2. Dynamic -> LinkedList, Stack, Queue

? Types of Non Linear
* 1. Dynamic -> Tree, Graph

!2. Introduction to Algorithms
* Algorithm refers to a set of rules/instructions that step-by-step define how a work is to be executed upon in order to get the expected results.

!3. Introduction to Analysis of Algorithms
* In order to solve a given problem, there can be several different algorithms, So to find the best algorithm is known as Analysis of Algorithms.

? To find the best algorithm ,We usually check two things:
* 1. Time Complexity -> It is the number of operations required to complete an algorithm, as a function of the length of it's input.
* 2. Space Complexity -> It is the amount of space or memory required to complete an algorithm.

!4. Asymptotic Analysis
* Usually we don't go by the exact numbers, So there are mathematical models which help us in determining the time and space complexity. The analysis which deals with those mathematical models is known as Asymptotic Analysis.

* Asymptotic Analysis helps us to determine, how time and space taken up by an given algorithm increases in terms of its input size.

!5. Order of Growth
* A function f(n) is said to be growing faster than g(n) if
* 1. limit of g(n)/f(n) = 0 with n tends to infinite
OR
* 2. limit of f(n)/g(n) = infinity with n tends to infinite.
where:
f(n) and g(n) -> time taken by two algorithms to solve the same problem.
n -> number of input

? Direct way to find the Order of Growth
* 1. Ignore lower order terms
* 2. Ignore constant terms
Ex:
f(n) = 2(n^3) + n + 6, Order of Growth = n^2 (Quadratic)
g(n) = 100(n) + 3, Order of Growth = n (Linear)

? Comparing Terms
* C < log(log(n)) < log(n) < n^(1/3) < n^(1/2) < n < n*log(n) < n^(3/2) < n^(4/2) < n^2 < n^3 < 2^n < n! < n^n
todo: where: c grows slowest, having lowest order of growth, Best and n^n grows fastest, having highest order of growth, Worst.

!6. Best, Average and Worst cases
* The minium order of growth is know as the best case and The maximum order of growth is know as the worst case.
* We usually find the maximum order of growth for an given algorithm to indicate Time complexity of that given algorithm.

!7. Asymptotic Notations
* It is the mathematical notations to represent the order of growth. The asymptotic analysis is being done by asymptotic notations.
? Asymptotic Notations helps us in determining:
* 1. Best Case
* 2. Average Case
* 3. Worst case

? Types of Asymptotic Notations:
* 1. Omega Notation
* 2. Theta Notation
* 3. Big O Notation

!8. Big O Notation (Mostly Used) (Gives the Worst Case)
* It gives the exact or upper bound order of growth (Mostly Used).
* If the order of growth of a given algorithm is Big O(n) than we can also indicate any value lower than n. i.e C < log(log(n)) < log(n) < n^(1/3) < n^(1/2).

!9. Omega Notation (Never Used) (Gives the Best Case)
* It gives the exact or lower bound order of growth.
* If the order of growth of a given algorithm is Omega(n) than we can also indicate any value higher than n. n^2 < n^3 < 2^n < n^n.

!10. Theta Notation (Impractical)
* It gives the exact order of growth (impractical)

!11. Analysis of Common loops
* 1. for(int i = 1; i < n; i = i + c){} -> O(n)
* 2. for(int i = 1; i < n; i = i - c){} -> O(n)
* 3. for(int i = 1; i < n; i = i * c){} -> O(log(n))
* 4. for(int i = 1; i < n; i = i / c){} -> O(log(n))
* 5. for(int i = 1; i < n; i = pow(i, c)){} -> O(log(log(n)))
* 6. for (int i = 0; i * i < n; i++) {} -> O(sqrt(n))

!12. Analysis of multiple loops
? Rules:
* Ignore lower order terms and constant terms
* C < log(log(n)) < log(n) < n^(1/3) < n^(1/2) < n < n*log(n) < n^(3/2) < n^(4/2) < n^2 < n^3 < 2^n < n! < n^n
todo: where: c grows slowest, having lowest order of growth, Best and n^n grows fastest, having highest order of growth, Worst.

* 1. Subsequent Loops: add
function(){
         for(int i = 1; i < n; i = i + c){} -> O(n)
         for(int i = 1; i < n; i = i * c){} -> O(log(n))
         for(int i = 1; i < n; i = i++){} -> O(1)
      }
* O(n) + O(log(n)) + O(1) = O(n)

* 2. Nested Loops: multiply
function(){
   for(int i = 1; i < n; i = i ++){ -> O(n)
      for(int i = 1; i < n; i = i * c){ -> O(log(n))
      }
   }
}
* O(n) * O(log(n)) = O(n*log(n))

* 3. Nested and Subsequent Loops:
function(){
   for(int i = 1; i < n; i = i ++){ -> O(n)
      for(int i = 1; i < n; i = i * c){ -> O(log(n))
      }
   }
   O(n*log(n))

   for(int i = 1; i < n; i = i ++){ -> O(n)
      for(int j = 1; j < n; j = j ++){ -> O(n)
      }
   }
   O(n^2)
}
* O(n*log(n)) + O(n^2) = O(n*log(n) + (n^2))

* 4.
function(){
   for (i = 0; i < n; i++) {}
   for (j = 0; j < m; j++) {}
}
* O(n+m)

* 5.
function(){
   for(int i = 0; i < n*n; i++) {
      for(int j = 0; j < n/2; j += 2) {}
   }
}
* O(n^2) * O(n/2) = O(n^3)

!13. Analysis of Recursion (Introduction)
* To find out the time and space complexity of a recursion function we first find out the recurrence relation.

* 1.
void fun(int n){
   if(n<=0){ return; }  -> O(1)
   print(" Hello ");
   fun(n/2);   -> T(n/2)
   fun(n/2);   -> T(n/2)
}
* Here recurrence relation is T(n/2) + T(n/2) + O(1) = 2T(n/2)

* 2.
void fun(int n){
   if(n<=0){ return; }
   for (i = 0; i < n; i++) {}; -> O(n)
   fun(n/2);   -> T(n/2)
   fun(n/2);   -> T(n/3)
}
* Here recurrence relation is O(n) + T(n/2) + T(n/2) = O(n) + 2T(n/2)

* 3.
void fun(int n){
   if(n<=0){ return; }
   fun(n-1);   -> T(n-1)
}
* Here recurrence relation is T(n-1)

* now we have to solve the recurrence relation to find out time and space complexity.

!14. Recursion Tree Method for Solving Recurrences
* 1. Recurrence relation = 2T(n/2) = O(n log(n))
* 2. Recurrence relation = 2T(n-1) = O(2^n)
* 3. Recurrence relation = T(n/2) = O(log(n))
* 4. Recurrence relation = 2T(n/2) = O(n)
* 5. Recurrence relation = T(n/4) + T(n/2) = O(n)
* 6. Recurrence relation = T(n-1) + T(n-2) = O(2^n)

!15. Space Complexity
It is the order of growth of memory space or ram space in term of input size

* 1.
int fun(int n){
   return n*2;
}
* O(1)

* 2.
int fun(int n){
   int sum = 0;
   for(int i = 1; i <= n; i++){
      sum += i;
   }
   return sum;
}
* O(1)

* 3.
int fun(int arr[], int n){
   int sum = 0;
   for(int i = 1; i <= n; i++){
      sum += arr[i];
   }
   return sum;
}
* O(n)

? Auxiliary Space:
* It is the order of growth of extra memory space you create to solve a problem. Space create in the memory other than i/p and o/p. It is much more important than Space Complexity.

* 3.
int fun(int arr[], int n){
   int sum = 0;
   for(int i = 1; i <= n; i++){
      sum += arr[i];
   }
   return sum;
}
* Space Complexity: O(n)
* Auxiliary Space: O(1)

* 4. Recursion: These function needs extra space to store function calls in the function call stack.
int fun(int n){
   if(n<=0){
      return;
   }
   return n + fun(n-1);
}
* Space Complexity: O(n)
* Auxiliary Space: O(n)

* 5.
int fun(int n){
   if(n == 0 || n == 1){
      return n;
   }
   return fun(n-1) + fun(n-2);
}
* Space Complexity: O(n)
* Auxiliary Space: O(n)

* 6.
int fun(int n){
   int f[n + 1];
   f[0] = 0;
   f[1] = 1;
   for(int i = 2; i <= n; i++){
      f[i] = fun[i-1] + fun[i-2]
   }
   return f[n];
}
* Space Complexity: O(n)
* Auxiliary Space: O(n)

* 7.
int fun(int n){
   if(n == 0 || n == 1){
      return n;
   }
   int a = 0, b = 1;
   for(int i = 2; i <= n; i++){
     c = a + b;
     a = b;
     b = c;
   }
   return c;
}
* Space Complexity: O(1)
* Auxiliary Space: O(1)
-->
