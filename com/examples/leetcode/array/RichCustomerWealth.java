package com.examples.leetcode.array;

import java.util.Arrays;

public class RichCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts= {{1,2,3},{3,2,1}};
        int sum = 0;
        int wealth[] = new int[accounts.length];
        for(int i=0; i<accounts.length; i++){
            for(int ai: accounts[i]){
                sum = sum +ai;
            }
            wealth[i]=sum;
            sum =0;
        }
        System.out.println(Arrays.stream(wealth).max().getAsInt());
    }
}
