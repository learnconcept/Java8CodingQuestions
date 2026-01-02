package com.examples.dsa.array;

import java.util.Arrays;

public class IncreaseArray {
    public static void main(String[] args) {
        int[] array = {5,9,3,10};

        int[] temp= new int[array.length * 2];
        for(int i=0; i<array.length; i++){
           temp[i]=array[i];
        }
        array = temp;

        Arrays.stream(array).forEach(System.out::println);
    }

}
