# DivisorFinder
Make a class called DivisorFinder. It should have the following methods:
A static method countFactors that accepts an integer parameter returns the number of factors of the integer. 
countFactors(24) returns 8 because 
1, 2, 3, 4, 6, 8, 12, and 24 are factors of 24.
Must use a while loop (no do or for loops) to do this!
A static method isPrime which returns whether or not an integer is prime. This method must call countFactors.

Example: isPrime(27) returns false and isPrime(47) returns true. 
A static method countPrimes that accepts in integer parameter n returns the number of primes from 2 to n. You must call isPrime().
countPrimes(24) returns 9 because 
2, 3, 5, 7, 11, 13, 17, 19, 23 are primes less than or equal to 24
Must use a while loop (no do or for loops) to do this!
A main method that prints the results of calling countFactors, isPrime, and countPrimes on at least 2 different inputs each.

DO NOT MODIFY DIVISORFINDERTEST.JAVA
