package com.examples.leetcode.array;

public class LargestLocalMatrix {

    public static void main(String[] args) {

        int[][] grid = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        int n = grid.length;
        int[][] maxResultGrid=new int[n-2][n-2];
        for(int i=0; i<n-2; i++){
            for(int j=0; j<n-2; j++){
                maxResultGrid[i][j]=findMaxGrid(grid, i, j);

            }
        }
    }

    private static int findMaxGrid(int[][] grid, int iStart, int jStart) {
        int max =Integer.MIN_VALUE;
        for(int i=iStart; i<iStart+3; i++){
            for(int j=jStart; j<jStart+3; j++){
                max=Math.max(max, grid[i][j]);
            }
        }
        System.out.println(max);
        return max;
    }
}
