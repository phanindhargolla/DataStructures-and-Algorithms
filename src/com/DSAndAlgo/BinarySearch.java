package com.DSAndAlgo;

public class BinarySearch {
    public int binarySearch(int[] arr,int data){
        int l = 0;
        int r = arr.length - 1;
        while(l <= r){
            int mid = l + (r - l)/2;
            if(arr[mid] == data){
                return mid;
            }else if(arr[mid] > data){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return -1;
    }
}
