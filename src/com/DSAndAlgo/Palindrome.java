package com.DSAndAlgo;

public class Palindrome {
    public boolean palindrome(String str){
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while(start <= end){
            if(charArray[start] != charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
