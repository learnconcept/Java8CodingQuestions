package com.examples.leetcode.array;

public class RemoveDuplicateSorted {
    public static void main(String[] args) {
        int nums[]={1,1,2};
        int j=1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]!=nums[i+1]){
                nums[j]=nums[i+1];
                j++;
            }
        }
        System.out.println(j);
    }
}
