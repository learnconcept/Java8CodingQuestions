package com.examples.dsa.concept.resursion;

import java.util.Scanner;

import static java.util.Collections.swap;

public class RecurStringPermutation {
    static void main() {
        System.out.println("Please enter a string" );
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        recurStrPermutation(str.toCharArray(), 0);
    }

    private static void recurStrPermutation(char[] arr, int fi) {
            if(fi == arr.length) {
                System.out.println(arr);
                return;
            }
            for(int i = fi; i < arr.length; i++) {
                swapArray(arr, i, fi);
                recurStrPermutation(arr, fi + 1);
                swapArray(arr, i, fi);
            }
    }

    private static void swapArray(char[] arr, int i, int fi) {
        char temp = arr[i];
        arr[i] = arr[fi];
        arr[fi] = temp;
    }
}
