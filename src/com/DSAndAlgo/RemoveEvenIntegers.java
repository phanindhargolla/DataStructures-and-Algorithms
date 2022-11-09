package com.DSAndAlgo;

public class RemoveEvenIntegers {
    public int[] removeEvenIntegers(int[] arr){
        int oddCount = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i]%2 != 0){
                oddCount++;
            }
        }
        int result[] = new int[oddCount];
        int idx = 0;
        for(int j = 0;j < arr.length;j++){
            if(arr[j]%2 != 0){
                result[idx++] = arr[j];
            }
        }
        return result;
    }
}
