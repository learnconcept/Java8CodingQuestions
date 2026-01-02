package com.examples.dsa.array;

public class FindMin {
    public static void main(String[] args) {
        int[] nums = {25,22,27,63,02,34,45};
        int min = nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println(min);
    }
}
