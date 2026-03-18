package com.examples.dsa.tap;

import java.util.Scanner;

public class FindPrimeNum {

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        //System.out.println(findNumIsPrime(num));
        System.out.println(findNumIsPrime2(num));

    }

    private static boolean findNumIsPrime2(int num) {
        for (int i = 2; i <= num/2; i++) {
            if(num%i==0){
                return false;
            }
        }
        return Boolean.TRUE;
    }

    //using bruteforce
    private static Boolean findNumIsPrime(int num) {
        int count = 0;
        if(num==1 || num==2 || num==3){
            return Boolean.TRUE;
        }
        for (int i = 2; i <=num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if(count>1){
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
