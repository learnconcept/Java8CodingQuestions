package com.examples.leetcode.array;

import java.util.Arrays;
import java.util.List;

public class CountPairs {
    public static void main(String[] args) {
        // List<Integer> nums = Arrays.asList(-1,1,2,3,1);
        List<Integer> nums = Arrays.asList(-6, 2, 5, -2, -7, -1, 3);
        int target = -2;
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
