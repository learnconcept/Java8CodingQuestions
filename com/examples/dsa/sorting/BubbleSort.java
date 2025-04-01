package com.examples.dsa.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] ={5,12,4,1,8,2};

        Arrays.stream(bubbleSort(arr)).forEach(System.out::println);
    }

    private static int[] bubbleSort(int[] arr) {
        boolean isSwapped;
        for(int i=0; i< arr.length-1; i++){
            isSwapped = false;
            for(int j=0; j<arr.length-1-i; j++){
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(isSwapped == false) break;
        }
        return arr;

    }
}
