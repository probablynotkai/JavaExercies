package com.probablynotkai.exercises.recursion;

public class StringCopies
{
    /**
     *Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere.
     * N will be non-negative.
     * @param str String
     * @param sub Substring
     * @param n
     * @return Copies of sub in str
     */
    public boolean strCopies(String str, String sub, int n){
        if (n < 0){
            return false;
        } else if (n == 0){
            return !(str.contains(sub));
        } else{
            return (str.contains(sub) && strCopies(str.replaceFirst(sub, ""), sub, n - 1));
        }
    }
}
