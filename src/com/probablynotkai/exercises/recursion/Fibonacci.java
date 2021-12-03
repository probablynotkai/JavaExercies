package com.probablynotkai.exercises.recursion;

public class Fibonacci
{
    /**
     * The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition.
     * Define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing the start of the sequence.
     * @param n
     * @return nth fibonacci number
     */
    public int fibonacci(int n){
        if (n == 0){
            return n;
        } else if (n == 1){
            return n;
        } else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
}
