package com.examples.dsa.concept;

import java.util.Scanner;

public class BinaryToInt {
    static void main() {
        System.out.println("Enter a binary number");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        binaryToInt(str);
    }

    private static void binaryToInt(String str) {
        int res = 0;
        int powerOf2 = 1;
        for(int i=str.length()-1; i>=0; i--){
            if(str.charAt(i)=='1'){
                res = res + powerOf2;
            }
            powerOf2 *= 2;
        }
        System.out.println(res);
    }
}
