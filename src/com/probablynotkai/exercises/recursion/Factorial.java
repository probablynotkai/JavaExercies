package com.probablynotkai.exercises.recursion;

public class Factorial
{
    /**
     * Given n of 1 or more, return the factorial of n using a recursive function.
     * @param n
     * @return f(n) = n*(f(n-1))
     */
    public int factorial(int n){
        if (n == 1){ // Base case
            return n;
        } else {
            return n*factorial(n-1); // Recursive step
        }
    }
}
