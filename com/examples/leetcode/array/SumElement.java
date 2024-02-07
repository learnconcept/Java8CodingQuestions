package com.examples.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;

public class SumElement {
    public static void main(String[] args) {
        int[] numbers={1,3,4,5,78,9};
        int sumElement=13;
        // Find the 2 indexes of given array for sumElement in single pass (No 2 loops)
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0; i<numbers.length; i++){
            int diff = sumElement - numbers[i];
            if(hashMap.containsKey(diff)){
               System.out.println("Two numbers indices "+hashMap.get(diff)+" , "+i);
               return;
            }
            hashMap.put(numbers[i], i);
        }

    }
}
