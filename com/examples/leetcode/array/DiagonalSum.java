package com.examples.leetcode.array;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int sum=0;
        int size = mat.length;

        for(int i=0; i<size; i++){
            sum+=mat[i][i] + mat[i][size-i-1];
        }
        if(size%2!=0){
            sum-=mat[size/2][size/2];
        }
        System.out.println(sum);
    }
}
