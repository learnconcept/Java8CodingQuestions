package com.examples.leetcode.array;

public class MinTimeToVisitAllPoints {
    public static void main(String[] args) {
        int[][] points = {{1,1},{3,4},{-1,0}};

       int count =0;
       int point1[] = points[0];
       for(int i=1; i< points.length; i++){
           int point2[]=points[i];
           int xDiff = point2[0]-point1[0];
           int yDiff = point2[1]-point1[1];
           count+=Math.max(Math.abs(xDiff), Math.abs(yDiff));
           point1 = point2;
       }
       System.out.println(count);
    }
}
