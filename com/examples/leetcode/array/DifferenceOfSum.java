package com.examples.leetcode.array;

public class DifferenceOfSum {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        int elementSum = 0;
        int digitSum =0;
        for(int i: nums){
            elementSum+=i;
            if(i>9){
                while(i>0){
                    digitSum+=i%10;
                    i=i/10;
                }
            }else{
                digitSum+=i;
            }
        }
        System.out.println(Math.abs(elementSum-digitSum));
    }
}
