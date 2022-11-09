package com.DSAndAlgo;

public class MoveZerosEnd {
    public int[] moveZerosEnd(int[] arr){
        int j = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0){
                j++;
            }
        }
        return arr;
    }
}
