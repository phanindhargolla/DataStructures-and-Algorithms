package com.DSAndAlgo;

public class QuickSort {
    public int[] quickSort(int[] arr,int lb,int ub){
        if(lb < ub) {
            int loc = partition(arr,lb,ub);
            quickSort(arr,lb,loc-1);
            quickSort(arr,loc+1,ub);
        }
        return arr;
    }

    public static int partition(int[] arr,int lb,int ub){
        int start = lb;
        int end = ub;
        int pivot = arr[lb];

        while(start <= end) {
            while(arr[start] <= pivot){
                start++;
            }
            while(arr[end] > pivot){
                end--;
            }
            if(start < end){
                swap(arr,start,end);
            }
        }
        swap(arr,lb,end);
        return end;
    }

    public static void swap(int[] arr,int lb,int ub){
        int temp = arr[lb];
        arr[lb] = arr[ub];
        arr[ub] = temp;
    }
}
