package com.examples.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class SubarraysDistinctSumSquares {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int len = nums.length;
        int count =0;
        for(int i=0; i<len; i++){
            List<Integer> distinct = new ArrayList<>();
            for(int j=i; j<len; j++){
                if(!distinct.contains(nums[j])){
                    distinct.add(nums[j]);
                }
                count+=distinct.size() * distinct.size();
            }
        }

        System.out.println(count);
    }
}
