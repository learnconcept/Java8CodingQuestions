package com.examples.dsa.concept.resursion;

import java.util.Scanner;

public class RecurPhoneKeyPad {

    static String[] keypad = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static void main() {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        recurPhoneKeyPad(number, "");
    }

    private static void recurPhoneKeyPad(String numberStr, String ans) {
        if(numberStr.length() == 0){
            System.out.println(ans);
            return;
        }
        String key = keypad[numberStr.charAt(0) - 48];
        for(int i =0; i<key.length(); i++){
            recurPhoneKeyPad(numberStr.substring(1), ans+key.charAt(i));
        }

    }
}
