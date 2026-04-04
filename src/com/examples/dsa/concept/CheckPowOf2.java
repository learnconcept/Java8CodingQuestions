package com.examples.dsa.concept;

import java.util.Scanner;

public class CheckPowOf2 {
    static void main() {
        System.out.println("Enter the value ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        isPowOf2(num);
    }

    private static void isPowOf2(int num) {
        int count = 0;
        while(num > 0 ){
            num = num & (num-1);
            count ++;
        }
        if(count > 1){
            System.out.println("The number is not  power of 2");
        }else{
            System.out.println("The number is power of 2");
        }

    }
}
