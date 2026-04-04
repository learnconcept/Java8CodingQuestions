package com.examples.dsa.concept.binary;

import java.util.Scanner;

public class SetBitCount {
    static void main() {
        System.out.println("Enter the value ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        setBitCount(num);
    }

    private static void setBitCount(int num) {
        int count = 0;
        while(num > 0){
            num = num & (num-1);
            count++;
        }
        System.out.println(count);
    }
}
