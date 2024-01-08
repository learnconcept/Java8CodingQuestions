package com.examples.leetcode.array;

public class CountKDifference {

    public static void main(String[] args) {
        int[] nums = {1,3};
        int k = 3;

        int count = 0;

        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                int diff = Math.abs(nums[i]-nums[j]);
                if(k == diff){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
