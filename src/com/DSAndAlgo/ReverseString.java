package com.DSAndAlgo;
import java.util.Stack;

public class ReverseString {
    public String reverseString(String str){
        char[] charArray = str.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for(char ch : charArray){
            stack.push(ch);
        }
        String result = "";
        for(int i = 0;i < charArray.length;i++){
            result += stack.pop();
        }
        return result;
    }
}
