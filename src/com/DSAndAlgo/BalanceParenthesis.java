package com.DSAndAlgo;
import java.util.Stack;

public class BalanceParenthesis {
    public boolean balanceParenthesis(String str){
        char[] charArray = str.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0;i < charArray.length;i++){
            if(charArray[i] == '[' || charArray[i] == '{' || charArray[i] == '('){
                stack.push(charArray[i]);
            }else if(charArray[i] == ']' || charArray[i] == '}' || charArray[i] == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.peek() == '[' || charArray[i] == ']'){
                    stack.pop();
                }else if(stack.peek() == '{' || charArray[i] == '}'){
                    stack.pop();
                }else if(stack.peek() == '(' || charArray[i] == ')'){
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
