package com.examples.leetcode.array;

public class MaximizeSum {

    public static void main(String[] args) {
        int[] nums = {5,5,5};
        int k = 2;
        int sum=0;
        int temp=0;

        for (int i=0; i<k; i++){
            temp = nums[nums.length-1];
            nums[nums.length-1] = temp+1;
            sum+= temp;
        }
        System.out.println(sum);
    }
}
