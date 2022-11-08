package com.DSAndAlgo;

public class SelectionSort {
    public int[] selectionSort(int[] arr){
        for(int i = 0;i < arr.length - 1;i++){
            int min = i;
            for(int j = i+1;j < arr.length;j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            if(i != min){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
}
