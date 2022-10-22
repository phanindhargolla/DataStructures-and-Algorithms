package com.DSAndAlgo;

public class Main {
    public static void main(String[] args){
        int[] nums = {8, 7, 2, 5, 3, 1};
        int target = 10;
        PairSum pairsum = new PairSum();
        System.out.println("Finding the pair for the given target using Brute Force");
        printArray(pairsum.pairSumBruteForce(nums, target));
        System.out.println("");
        System.out.println("Finding the pair for the given target using Sorting");
        printArray(pairsum.pairsumSort(nums,target));
        System.out.println("");
        System.out.println("Finding the pair for the given target using HashMap");
        printArray(pairsum.pairsumSort(nums,target));
    }

    public static void printArray(int[] arr){
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
