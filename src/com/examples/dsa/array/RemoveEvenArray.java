package com.examples.dsa.array;

import java.util.Arrays;

public class RemoveEvenArray {
    public static void main(String[] args) {
        int[] nums = {25,22,27,63,102,34,45};
        int oddCount =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2!=0){
                oddCount++;
            }
        }
        int[] oddArray = new int[oddCount];
        int idx=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2!= 0){
                oddArray[idx]=nums[i];
                idx++;
            }
        }
        Arrays.stream(oddArray).forEach(System.out::println);
    }

}
