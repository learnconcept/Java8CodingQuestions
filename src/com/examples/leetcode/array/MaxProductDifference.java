package com.examples.leetcode.array;

import java.util.Arrays;

public class MaxProductDifference {

    public static void main(String[] args) {
        int[] nums = {5,6,2,7,4};

        if(nums.length>3){

        Arrays.sort(nums);
        int prod1 = nums[nums.length-1] * nums[nums.length-2];

        int prod2= nums[0] * nums[1];

        System.out.println(prod1-prod2);
        }

    }
}
