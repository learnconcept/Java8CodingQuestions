package com.examples.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class DecompressRLElist {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3};
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length; i=i+2){
                int fre = nums[i];
                int val = nums[i+1];
                for(int k=0; k<fre; k++){
                    list.add(val);
                }
            }
        list.forEach(System.out::println);
    }
}
