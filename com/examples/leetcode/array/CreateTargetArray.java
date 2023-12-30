package com.examples.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArray {

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int n = nums.length;

        List<Integer> target = new ArrayList<Integer>();

        for(int i =0; i<n; i++){
            target.add(index[i], nums[i]);
        }
        int[] result = new int[target.size()];
        int ind =0;
        for(Integer i: target){
            result[ind++] = i;
        }

        Arrays.stream(result).forEach(System.out::println);
    }
}
