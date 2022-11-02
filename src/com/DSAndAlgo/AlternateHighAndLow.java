package com.DSAndAlgo;
import java.util.*;

public class AlternateHighAndLow {

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void alternateHighandLowOpt(int[] arr){
        for(int i = 1;i < arr.length;i+=2){
            if(arr[i-1]>arr[i]){
                swap(arr,i-1,i);
            }
            if(i+1 < arr.length && arr[i+1] > arr[i]){
                swap(arr,i+1,i);
            }
        }
    }
}
