package com.DSAndAlgo;

public class BinaryArrLinear {
    //Using BruteForce
    //Time Complexity - O(n)
    //Space Complexity - O(1)
    public int[] binaryLinearBrute(int[] arr){
        int zeros = 0;
        for(int a : arr){
            if(a == 0){
                zeros++;
            }
        }
        for(int i = 0;i < arr.length;i++){
            if(i < zeros){
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }
        return arr;
    }

    //Binary Array with Linear time and no counting
    //Time Complexity - O(n)
    //Space Complexity - O(1)
    public int[] binaryLinearWithoutCount(int[] arr){
        int k = 0;
        int i = 0;
        while(i < arr.length){
            if(arr[i] == 0){
                arr[k++] = 0;
            }
            i++;
        }
        while (k < arr.length){
            arr[k++] = 1;
        }
        return arr;
    }

    //QuickSort
    //Time Complexity - O(n)
    //Space Complexity - O(1)
    public int[] binaryLinearQuickSort(int[] arr){
        int pivot = 1;
        int j = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] < pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
                }
        }
        return arr;
    }
}
