package com.examples.dsa.concept.resursion;

import java.util.Scanner;

public class RecursiveAddDigits {

    static void main() {
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(addDigits(num));
    }

    private static int addDigits(int num) {
        if (num == 0) return 0;
        return (num % 10) + addDigits(num / 10);
    }
}
