package com.examples.dsa.array;

import java.util.Arrays;

public class FindMissiingNumber {
    //Range 1 to n with n-1 array distinct

    public static void main(String[] args) {
        int[] arr= {2,4,1,8,6,3,7};

        int n = arr.length +1;

        int sumOfInteger = n * (n +1)/2;
        int sumOfArray = Arrays.stream(arr).sum();
        int missing = sumOfInteger - sumOfArray;
        System.out.println(missing);

        //Approach 2
        for(int a: arr){
            sumOfInteger = sumOfInteger -a;
        }
        System.out.println(sumOfInteger);

    }
}
