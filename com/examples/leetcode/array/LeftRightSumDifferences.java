package com.examples.leetcode.array;

import java.util.Arrays;
import java.util.stream.Stream;

public class LeftRightSumDifferences {

    public static void main(String[] args) {
        int[] nums ={10,4,8,3};
        int n = nums.length;

        int[] leftSum = new int[n];
        for(int i =1; i<n; i++ ){
            leftSum[i] = leftSum[i-1] + nums[i-1];
        }

        int[] rightSum = new int[n];
        for(int i=n-2; i>=0; i--){
            rightSum[i] = rightSum[i+1] + nums[i+1];
        }

        int[] ans = new int[n];
        for(int i =0; i<n; i++){
            ans[i] = Math.abs(leftSum[i]-rightSum[i]);
        }

        Arrays.stream(ans).forEach(System.out::println);

    }
}
