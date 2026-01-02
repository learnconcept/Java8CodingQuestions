package com.examples.leetcode.array;

public class SumOddLengthSubarrays {

    public static void main(String[] args) {
        int arr[] = {1,4,2,5,3};
        int len = arr.length;
        int sum =0;
        for(int i=0; i<len; i++){
            for(int j=i; j<len; j++){
                for(int k=i; k<=j; k++){
                    if((j-i+1)%2!=0){
                        sum+=arr[k];
                    }
                }
            }
        }
        System.out.println(sum);

    }
}
