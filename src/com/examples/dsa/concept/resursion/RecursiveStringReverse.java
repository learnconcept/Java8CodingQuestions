package com.examples.dsa.concept.resursion;

import java.util.Scanner;

public class RecursiveStringReverse {
    static void main() {
        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = stringReverse(str, "", str.length()-1);
        System.out.println(rev);
    }

    private static String stringReverse(String str, String rev, int i) {
        if(i<0) return "";
        return rev+str.charAt(i)+stringReverse(str, rev, i-1);
    }
}
