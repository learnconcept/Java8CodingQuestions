package com.examples.dsa.concept.resursion;

import java.util.Scanner;

public class RecurSubStrings {
    static void main() {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        recurSbuStrings(str, "");
    }

    private static void recurSbuStrings(String str, String s) {
        if (str.length() == 0) {
            //We can add s to the ArrayList which can be created globally
            System.out.println(s);
            return;
        }
        recurSbuStrings(str.substring(1), s.concat(String.valueOf(str.charAt(0))));
        recurSbuStrings(str.substring(1), s);
    }
}
