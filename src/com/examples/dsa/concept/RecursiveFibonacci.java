package com.examples.dsa.concept;

import java.util.Scanner;

public class RecursiveFibonacci {
    static void main() {
        System.out.println("Enter the number to fibonacci series");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findFib(n);
    }

    private static int findFib(int n) {
        if(n == 1 || n == 2)
            return 1;
        n = findFib(n - 1) + findFib(n - 2);
        return n;
    }
}
