package com.DSAndAlgo;
import java.util.Stack;

public class NextGreater {
    public int[] nextGreaterElementBrute(int[] arr){
        for(int i = 0;i < arr.length;i++){
            int flag  = 0;
            for(int j = i+1;j < arr.length;j++){
                if(arr[i] < arr[j]){
                    arr[i] = arr[j];
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                arr[i] = -1;
            }
        }
        return arr;
    }

    public int[] nextGreaterStack(int[] arr){
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = arr.length - 1;i >= 0;i--){
            if(!stack.isEmpty()){
                while(!stack.isEmpty() && stack.peek() <= arr[i]){
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                result[i] = -1;
            }else{
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }
}
