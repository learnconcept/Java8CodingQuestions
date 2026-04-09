package com.examples.dsa.concept.resursion;

public class RecursiveSumArray {
    static void main() {
        int [] arr = {10,30,50,70};
        System.out.println(recursiveSumArray(arr, 0));
    }

    private static int recursiveSumArray(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + recursiveSumArray(arr, index+1);
    }
}
