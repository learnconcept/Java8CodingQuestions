package com.examples.dsa.concept.binary;

import java.util.Scanner;

public class IntToBinary {
    static void main() {
        System.out.println("Enter an integer to convert to Binary");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        intToBinary_usingStrBuilder(n);
        intToBinary_usingStr(n);
    }

    private static void intToBinary_usingStr(int n) {
        String str = "";
        while(n>=1){
            int rem = n%2;
            str = rem+str;
            n = n/2;
        }
        System.out.println(str);
    }

    private static void intToBinary_usingStrBuilder(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        if(n!=0){
            while(n>=1){
                stringBuilder = stringBuilder.append(n%2);
                n = n/2;
            }
        }
        System.out.println(stringBuilder.reverse());
    }
}
