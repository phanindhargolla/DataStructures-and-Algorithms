package com.DSAndAlgo;
import java.util.*;
import java.util.stream.*;

public class Duplicate {
    //Using Hash Set
    //Time Complexity - O(n)
    //Space Complexity - O(n)
    public int duplicateSet(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int num: arr){
            if(set.contains(num)){
                return num;
            }else{
                set.add(num);
            }
        }
        return -1;
    }

    //Using Hashing
    //Time Complexity - O(n)
    //Space Complexity - O(n)
    public int duplicateHashing(int[] arr){
        boolean[] visited = new boolean[arr.length + 1];
        for(int num : arr){
            if(visited[num]){
                return num;
            }
            visited[num] = true;
        }
        return -1;
    }

    //Using Array Indices
    public int duplicateArray(int[] arr){
        int duplicate = -1;
        for(int i : arr){
            int val = (i < 0) ? -i : i;
            if(arr[val] >= 0){
                arr[val] = -arr[val];
            }else{
                duplicate = val;
                break;
            }
        }
        return duplicate;
    }

    //Using XOR
    //Time Complexity - O(n)
    //Space Complexity - O(1)
    public int duplicateXOR(int[] arr){
        int xor = 0;
        for(int n : arr){
            xor ^= n;
        }
        for(int i = 1;i < arr.length;i++){
            xor ^= i;
        }
        return xor;
    }

    //Using IntStrem by sum
    //Time Complexity - O(n)
    //Space Complexity - O(1)
    public int duplicateSum(int[] arr){
       int actual_sum = IntStream.of(arr).sum();
       int expected_sum = (arr.length) * (arr.length - 1) / 2;
       return actual_sum - expected_sum;
    }
}
