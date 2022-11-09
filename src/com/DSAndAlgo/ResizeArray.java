package com.DSAndAlgo;

public class ResizeArray {
    public int[] resizeArray(int[] arr,int capacity){
        int[] result = new int[capacity];
        for(int i = 0;i < arr.length;i++){
            result[i] = arr[i];
        }
        arr = result;
        return arr;
    }
}
