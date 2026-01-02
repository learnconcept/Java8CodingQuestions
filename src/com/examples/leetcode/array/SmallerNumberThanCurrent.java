package com.examples.leetcode.array;

import java.util.Arrays;

public class SmallerNumberThanCurrent {
    public static void main(String[] args) {
        int count=0;
        int[] nums = new int[]{8, 1, 2, 2, 3};
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(i!=j && nums[j]<nums[i]){
                    count++;
                }
            }
            result[i]=count;
            count =0;
        }
        Arrays.stream(result).boxed().forEach(System.out::println);
    }
}
