package com.examples.dsa.concept.resursion;

import java.util.Scanner;

public class RecursiveCountDigits {
    static void main() {
        System.out.println("Enter the digits");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(countDigits(num));
    }

    private static int countDigits(int num) {
        if (num == 0) return 0;
        return 1+countDigits(num / 10);
    }
}
