package com.examples.leetcode.array;

public class FlipImage {

    public static void main(String[] args) {
        int A [][] = {{1,1,0},{1,0,1},{0,0,0}};
        int c = A[0].length;
        for(int[] row: A){
            for(int i=0; i<(c+1)/2; i++){
                int temp = row[i];
                row[i] = 1- row[c-1-i];
                row[c-1-i] = 1-temp;
            }
        }
    }
}
