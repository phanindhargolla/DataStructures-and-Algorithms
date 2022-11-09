package com.DSAndAlgo;

public class MissingNumber {
    public int missingNumber(int[] arr){
        int sum = (arr.length + 1) * (arr.length + 2)/2;
        for(int i = 0;i < arr.length;i++){
            sum -= arr[i];
        }
        return sum;
    }
}

