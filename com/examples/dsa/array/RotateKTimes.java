package com.examples.dsa.array;

import java.util.Arrays;

public class RotateKTimes {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        k = k % arr.length;

        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, arr.length-1-k, arr.length-1);
        Arrays.stream(arr).forEach(a-> System.out.println(a));
    }

    private static void reverse(int[] arr, int start, int end) {
        while(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
