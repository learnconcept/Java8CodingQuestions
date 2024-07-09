package com.examples.dsa.array;

import java.util.Arrays;

public class ReverseArray {
    // Reverse array with 2 pointer
    public static void main(String[] args) {
        int [] array = {2,11,5,9,10,65,41};
        int start = 0;
        int end = array.length-1;
        int temp =0;
        while(start< end){
            temp = array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
        Arrays.stream(array).forEach(System.out::println);
    }
}
