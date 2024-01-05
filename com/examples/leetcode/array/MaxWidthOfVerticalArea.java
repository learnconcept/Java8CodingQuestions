package com.examples.leetcode.array;

import java.util.Arrays;

public class MaxWidthOfVerticalArea {

    public static void main(String[] args) {
        int[][] points = {{8,7},{9,9},{7,4},{9,7}};

        int[] xValues = new int[points.length];

        for(int i=0; i<points.length; i++){
            xValues[i]=points[i][0];
        }
        Arrays.sort(xValues);
        int result =0;
        for(int i=0; i<xValues.length-1; i++){
            result=Math.max(result, xValues[i+1]-xValues[i]);
        }
        System.out.println(result);
    }
}
