package com.examples.dsa.sorting;

import java.util.Arrays;

public class InserstionSort {
    public static void main(String[] args) {
        int arr[] = {5,8,3,1,6,2};
        Arrays.stream(insertionSort(arr)).forEach(System.out::println);
        }

    private static int[] insertionSort(int[] arr) {
        for(int i=1; i<arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]> temp){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1] = temp;
        }
       return arr;
    }
}
