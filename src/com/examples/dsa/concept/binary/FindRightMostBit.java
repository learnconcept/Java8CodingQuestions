package com.examples.dsa.concept.binary;

import java.util.Scanner;

public class FindRightMostBit {
    static void main() {
        System.out.println("Enter the number to find the right most bit");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        findRightMostBit(num);
    }

    private static void findRightMostBit(int num) {
        int count = 0;
        int mask = 1;
        while( (num & mask) == 0) {
            mask = mask << 1;
            count++;
        }
        System.out.println(count+1); // position based index so need to add +1
    }
}
