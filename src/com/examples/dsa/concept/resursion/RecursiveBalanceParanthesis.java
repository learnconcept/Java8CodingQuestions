package com.examples.dsa.concept.resursion;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveBalanceParanthesis {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char [] arr=new char[n*2];
        recurBalancePara(arr, n, 0, 0, 0);
    }

    private static void recurBalancePara(char[] arr, int n, int i, int o, int c) {
        if (i == arr.length) {
            System.out.print(Arrays.toString(arr));
            System.out.println();
        }
        if (o < n) {
            arr[i]='(';
            recurBalancePara(arr, n, i+1, o+1, c);
        }
        if (c < o) {
            arr[i]=')';
            recurBalancePara(arr, n, i+1, o, c+1);
        }
    }
}
