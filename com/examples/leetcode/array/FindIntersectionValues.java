package com.examples.leetcode.array;

import java.util.Arrays;

public class FindIntersectionValues {

    public static void main(String[] args) {
        int [] nums1 = {4,3,2,3,1};
        int[] nums2 = {2,2,5,2,3,6};

        int [] result = new int[2];
        int count =0;
        int count3 =0;
        int index =0;

        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i]==nums2[j]){
                    count++;
                    break;
                }
            }
            if(i==nums1.length-1){
                result[index]=count;
                index++;
            }
        }

        for(int i=0; i<nums2.length; i++){
            for(int j=i; j<nums1.length; j++){
                if(nums2[i]==nums1[j]){
                    count3++;
                    break;
                }
            }
            if(i==nums2.length-1){
                result[index]=count3;
            }
        }

        Arrays.stream(result).forEach(System.out::println);

    }
}
