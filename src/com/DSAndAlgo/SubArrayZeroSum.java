package com.DSAndAlgo;
import java.util.*;

public class SubArrayZeroSum {
    //BruteForce
    //Time Complexity - O(n^2)
    //Space Complexity - O(1)
    public void printAllSubArraysBrute(int[] arr){
        for(int i = 0;i < arr.length;i++){
            int sum = 0;
            for(int j = i;j < arr.length;j++) {
                sum += arr[j];
                if(sum == 0){
                    System.out.println("Subarray [" + i  + "..." + j + "]");
                }
            }
        }
    }

    //Using HashMap
    //Time Complexity - O(n)
    //Space Complexity - O(n)
    public static void insert(Map<Integer,List<Integer>> hashMap,int key,int value){
        hashMap.putIfAbsent(key, new ArrayList<>());
        hashMap.get(key).add(value);
    }

    public void printAllSubArrays(int[] nums){
        Map<Integer,List<Integer>> hashMap = new HashMap<>();
        insert(hashMap, 0, -1);
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            sum += nums[i];
            if(hashMap.containsKey(sum)){
                List<Integer> list = hashMap.get(sum);
                for(Integer value : list){
                    System.out.println("Subarray [" + (value + 1) + "..." + i + "]");
                }
            }
            insert(hashMap,sum,i);
        }
    }
}
