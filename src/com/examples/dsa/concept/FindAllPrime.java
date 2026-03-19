package com.examples.dsa.concept;

import java.util.Scanner;

public class FindAllPrime {

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        //using brute force which is O(n (n)^(1/2))
        //findAllPrime(n);
        primeErastasthenes(n);
        }

    private static void primeErastasthenes(int n) {
        boolean [] result = new boolean[n+1];
        // here i<=n can we written as Math.Squre(n)
        for(int i = 2; i<=n; i++){
            if(!result[i]){
                // here j = i * i will optimize
                for(int j=i*2; j<=n; j=j+i){
                    if(j%i==0){
                        result[j] = true;
                    }
                }
            }
        }
        for(int i=2; i<=n; i++){
            if(!result[i]){
                System.out.println(i);
            }
        }
    }

    private static boolean isPrimeCheck(int n) {
        for (int i = 2; i < n; i++) {
            if( n % i == 0){
                return false;
            }
        }
        return true;
    }

    private static void findAllPrime(int n){
        for(int i = 2; i <= n; i++) {
            if(isPrimeCheck(i)){
                System.out.println(i);
            }
        }
    }
}