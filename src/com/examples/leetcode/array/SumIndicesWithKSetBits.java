package com.examples.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SumIndicesWithKSetBits {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5,10,1,5,2);
        List<String> bitString = new ArrayList<>(nums.size());
        int k = 1;
        int sum = 0;
        for(int i=0; i<nums.size(); i++){
            bitString.add(Integer.toBinaryString(i));
        }


        for(int i=0; i<nums.size(); i++){
            int count =0;
            for(int j=0; j<bitString.get(i).length(); j++){
                if(bitString.get(i).charAt(j)=='1'){
                    count++;
                }
            }
            if(count == k){
                sum = sum +nums.get(i);
            }
        }
        System.out.println("Sum "+sum);
    }
}
