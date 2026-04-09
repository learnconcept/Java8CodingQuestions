package com.examples.dsa.concept.resursion;

import java.util.Scanner;

public class RecursivePalindrom {
    static void main() {
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(recursivePalindrom(str, 0, str.length()-1));
    }

    private static boolean recursivePalindrom(String str, int left, int right) {
        if(str.charAt(left) != str.charAt(right)) {
            return false;
        }
        if(left >= right) {
            return true;
        }
        return recursivePalindrom(str, left+1, right-1);
    }
}
