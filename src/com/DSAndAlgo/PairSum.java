package com.DSAndAlgo;
import java.util.*;

public class PairSum {

    //Brute Force
    //Time Complexity - O(n^2)
    //Space Complexity - O(1)
    public static int[] pairSumBruteForce(int[] arr, int target){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Please enter atleast two inputs");
        }
        for(int i = 0;i < arr.length - 1;i++){
            for(int j = i+1;j < arr.length;j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return new int[]{};
    }

    //Sorting and two pointer
    //Time Complexity - O(nlogn)
    //Space Complexity - O(1)
    public static int[] pairsumSort(int[] arr,int target){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Please enter atleast two inputs");
        }
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while(left < right) {
            if(arr[left] + arr[right] == target){
                return new int[] {arr[left],arr[right]};
            }else if(arr[left] + arr[right] > target){
                right--;
            }else{
                left++;
            }
        }
        return new int[] {};
    }

    //HashMap
    //Time Complexity - O(n)
    //Space Complexity - O(n)
    public static int[] pairSumHashing(int[] arr,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < arr.length;i++){
            int diff = target - arr[i];
            if(map.containsKey(diff)) {
                return new int[]{arr[i], diff};
            }else{
                map.put(arr[i],i);
            }
        }
        return new int[] {};
    }
}
