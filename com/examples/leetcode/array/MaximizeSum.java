package com.examples.leetcode.array;

import java.util.Arrays;

public class MaximizeSum {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 3;
        int sum=0;

        int max = Arrays.stream(nums).max().getAsInt();

        while(--k>=0){
            sum+=max+k;
        }

        System.out.println(sum);
    }
}
