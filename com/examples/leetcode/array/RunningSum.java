package com.examples.leetcode.array;

import java.util.Arrays;

public class RunningSum {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int res[] = new int[arr.length];
        int sum=0;
        for(int i=0; i<arr.length; i++){
            for(int j =0; j<=i; j++){
                sum = sum + arr[j];
            }
            res[i] = sum;
            sum=0;
        }
        Arrays.stream(res).boxed().forEach(System.out::println);
    }

}
