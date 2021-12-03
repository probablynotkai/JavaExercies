package com.probablynotkai.exercises;

public class FizzBuzz
{
    /**
     * Print integers 1 to N, but print "Fizz" if an integer is divisible by 3, "Buzz" if an integer is divisible by 5, and "FizzBuzz" if an integer is divisible by both 3 and 5.
     * @param n
     */
    public void fizzbuzz(int n){
        for (int i = 1; i < n+1; i++){
            /*
            // Compute whether iMOD3 is 0 and iMOD5 is 0
            if (i%3 == 0 && i%5 == 0){
                // Output "FizzBuzz"
                System.out.println("FizzBuzz");
            } else if (i%3 == 0){ // Compute whether iMOD3 is 0
                // Output "Fizz"
                System.out.println("Fizz");
            } else if (i%5 == 0){ // Compute whether iMOD5 is 0
                System.out.println("Buzz"); // Output "Buzz"
            } else {
                // Not a FizzBuzz number
                System.out.println(i);
            }*/
            System.out.println((i%3==0&&i%5==0?"FizzBuzz":(i%3==0?"Fizz":(i%5==0?"Buzz":(i)))));
        }
    }
}
