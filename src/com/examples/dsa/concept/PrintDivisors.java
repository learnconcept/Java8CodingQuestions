package com.examples.dsa.concept;

import java.util.Scanner;

public class PrintDivisors {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for divisors: ");
        int n = sc.nextInt();
        //BruteForce
        //printDivisors(n);
        //printDivisors_2(n); // to avoid BruteForce
        printDivisorsAsc(n);

    }

    private static void printDivisorsAsc(int n) {
        // todo
    }

    private static void printDivisors_2(int n) {
        for (int i = 1; i*i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i);
                System.out.print(",");
                if(i!=n/i) //this case to avoid divisor printing twice
                System.out.println(n/i);
            }
        }
    }

    private static void printDivisors(int n) {
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
    }
}
