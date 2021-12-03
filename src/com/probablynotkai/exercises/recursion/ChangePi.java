package com.probablynotkai.exercises.recursion;

public class ChangePi
{
    /**
     * Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".
     * @param str
     * @return Pi String
     */
    public String changePi(String str){
        if (!str.contains("pi")){
            return str;
        } else {
            return changePi(str.replaceFirst("pi", "3.14"));
        }
    }
}
