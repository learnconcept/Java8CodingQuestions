package com.examples.leetcode.array;

public class NumberOfEmployeesTarget {

    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4};
        System.out.println(numberOfEmployeesWhoMetTarget(arr, 2));
    }
        public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count =0;
            for(int i: hours){
                if(i>=target){
                    count++;
                }
            }
            return count;
        }
}
