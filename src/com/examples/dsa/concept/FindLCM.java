package com.examples.dsa.concept;

import java.util.Scanner;

public class FindLCM {

    // Brute force i.e O(a*b - max(a,b))
    static int findLCM(int a, int b, int max){
        while(Boolean.TRUE){
            if(max%a==0 && max%b==0){
                return max;
            }
            max++;
        }
        return 0;
    }

    // LCM(a,b) =( a * b ) /GCD(a,b)
    static int findLCMLucid(int a, int b){
        int gcd = 0;
        while(a!=b){
            if(a>b){
                a=a-b;
            }else{
                b=b-a;
            }
        }
        return a;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        int max = Math.max(a, b);
        System.out.println(findLCM(a, b, max));
        int gcd = findLCMLucid(a, b);
        System.out.println((a*b)/gcd);
    }
}
