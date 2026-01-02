package com.examples.leetcode.array;

import java.util.Arrays;

public class NumberGame {
    public static void main(String[] args) {
        int[] nums = {2,5};
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            int temp1 = nums[i];
            int temp2 = nums[i+1];
            nums[i]=temp2;
            nums[i+1]=temp1;
            i++;
        }
        Arrays.stream(nums).forEach(System.out::println);
    }
}
