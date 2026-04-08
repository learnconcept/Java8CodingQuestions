package com.examples.dsa.concept.resursion;

import java.util.Scanner;

public class RecursionPrintNumber {
    static void main() {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printNum(num);
        System.out.println();
        moreEffectiveWay(num);
    }

    private static void moreEffectiveWay(int num) {
        if(num < 1)
            return;
        moreEffectiveWay(num-1);
        System.out.print(num + " ");
    }

    private static void printNum(int num) {
        if(num>0){
            System.out.print(num + " ");
            printNum(num - 1);
        }
    }
}
