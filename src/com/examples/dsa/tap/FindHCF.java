package com.examples.dsa.tap;

import java.util.Scanner;

public class FindHCF {
    // logic is brut force as its O9min(a,b))
    public static int findHCF(int a, int b){
        int min = Math.min(a, b);
        for(int i=min; i>0; i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 1;
    }
     static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number : ");
        int a = sc.nextInt();
        System.out.println("Enter a second number : ");
        int b = sc.nextInt();
        System.out.println(findHCF(a, b));
    }
}
