package com.examples.dsa.concept;

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

    private static int findEfficientHcfLucid(int a, int b) {
        while(a != b){
            if(a>b){
                a = a-b;
            }else{
                b = b-a;
            }
        }
        return a;
    }
    private static int findHCFGaberialLame(int a, int b) {
        while ( a >0 && b >0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return Math.max(a, b);
    }
     static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number : ");
        int a = sc.nextInt();
        System.out.println("Enter a second number : ");
        int b = sc.nextInt();
        //System.out.println(findHCF(a, b));
        // System.out.println(findEfficientHcfLucid(a,b));
         System.out.println(findHCFGaberialLame(a,b));
    }




}
