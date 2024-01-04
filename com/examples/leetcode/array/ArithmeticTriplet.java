package com.examples.leetcode.array;

public class ArithmeticTriplet {

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,8,9};
        int diff = 2;
        int count =0;
        int n = nums.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=i+2; k<n; k++){
                    if((nums[k]-nums[j] == diff)
                            && (nums[j]-nums[i] == diff)){
                            count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
