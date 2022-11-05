package com.DSAndAlgo;

import com.sun.source.doctree.SystemPropertyTree;

public class Main {
    public static void main(String[] args){
        int[] nums = {8, -7, 2, 5, 3, 1};
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
        System.out.println("");
        SubArrayzero subArrayzero = new SubArrayzero();
        int[] nums2 = {8, -8, 2, 5, 3, 1};
        printArray(nums2);
        System.out.println(subArrayzero.subArray(nums2));
        System.out.println();
        int[] nums3 = { 1, 2, 3, 4, 4 };
        printArray(nums3);
        Duplicate duplicate = new Duplicate();
        System.out.println(duplicate.duplicateSet(nums3));
        System.out.println(duplicate.duplicateHashing(nums3));
        System.out.println(duplicate.duplicateSum(nums3));
        System.out.println(duplicate.duplicateXOR(nums3));
        System.out.println(duplicate.duplicateArray(nums3));
        System.out.println();
        int[] nums4 = { 1, 0, 1, 1, 1, 0, 0, 1 };
        printArray(nums4);
        BinaryArrLinear binaryArrLinear = new BinaryArrLinear();
        printArray(binaryArrLinear.binaryLinearBrute(nums4));
        printArray(binaryArrLinear.binaryLinearWithoutCount(nums4));
        printArray(binaryArrLinear.binaryLinearQuickSort(nums4));
        int[] x = { 1, 4, 7, 8, 10 };
        int[] y = { 2, 3, 9 };
        printArray(x);
        printArray(y);
        MergeTwoSortedArrays merge = new MergeTwoSortedArrays();
        merge.mergeSortedArrays(x,y);
        printArray(x);
        printArray(y);
        int[] nums5= {1, 2, 3, 4, 5, 6, 7};
        printArray(nums5);
        AlternateHighAndLow alternateHighAndLow = new AlternateHighAndLow();
        alternateHighAndLow.alternateHighandLowOpt(nums5);
        printArray(nums5);
        int[] nums6 = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        printArray(nums6);
        SubArrayZeroSum subArrayZeroSum = new SubArrayZeroSum();
        subArrayZeroSum.printAllSubArraysBrute(nums6);
        System.out.println();
        subArrayZeroSum.printAllSubArrays(nums6);
        System.out.println();
        IdenticalTrees identicalTrees = new IdenticalTrees();
        identicalTrees.createTree();
    }

    public static void printArray(int[] arr){
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
