package com.DSAndAlgo;

public class MergeSort {
    public int[] mergeSort(int[] arr,int lb,int ub){
        if(lb < ub){
            int mid = lb + (ub - lb)/2;
            mergeSort(arr,lb,mid);
            mergeSort(arr,mid+1,ub);
            merge(arr,lb,mid,ub);
        }
        return arr;
    }

    public static void merge(int[] arr,int lb,int mid,int ub){
        int i = lb;
        int j = mid + 1;
        int[] result = new int[arr.length - 1];
        int k = 0;
        while(i <= mid && j <= ub){
            if(arr[i] < arr[j]){
                result[k++] = arr[i++];
            }else{
                result[k++] = arr[j++];
            }
        }
        while(i <= mid){
            result[k++] = arr[i++];
        }
        while(j <= ub){
            result[k++] = arr[j++];
        }
    }
}
