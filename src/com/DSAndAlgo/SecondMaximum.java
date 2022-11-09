package com.DSAndAlgo;

public class SecondMaximum {
    public int secondMaximum(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i] > secondMax && arr[i] < max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
