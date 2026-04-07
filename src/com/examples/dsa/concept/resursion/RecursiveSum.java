package com.examples.dsa.concept.resursion;

import java.util.Scanner;

public class RecursiveSum {
    static void main() {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int val =recursiveSum(num);
        System.out.println(val);
    }

    private static int recursiveSum(int num) {
        if(num == 1)
            return 1;
        num = num + recursiveSum(num-1);
        return num;
    }
}
