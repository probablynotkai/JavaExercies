package com.probablynotkai.exercises.recursion;

public class BunnyEars
{
    /**
     * We have a number of bunnies and each bunny has two big floppy ears.
     * We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
     * @param bunnies
     * @return Bunny ears
     */
    public int bunnyEars(int bunnies){
        if (bunnies == 0){
            return bunnies;
        } else if (bunnies == 1){
            return bunnies*2;
        } else {
            return bunnyEars(bunnies-1)+2;
        }
    }
}
