package com.DSAndAlgo;
import java.util.*;

public class SubArrayzero {
    public static boolean subArray(int[] arr){
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        set.add(0);
        for(int i = 0;i < arr.length;i++){
           sum += arr[i];
           if(set.contains(sum)){
               return true;
           }
        }
        return false;
    }
}
