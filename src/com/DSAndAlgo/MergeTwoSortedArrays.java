package com.DSAndAlgo;

public class MergeTwoSortedArrays {
    public void mergeSortedArrays(int[] x,int[] y){
        int m = x.length;
        int n = y.length;

        for(int i = 0;i < m;i++){
            if(x[i] > y[0]){
                int temp = x[i];
                x[i] = y[0];
                y[0] = temp;
            }
            int first = y[0];

            int k;
            for(k = 1;k < n && y[k] < first;k++){
                y[k-1] = y[k];
            }
            y[k-1] = first;
        }
    }
}
