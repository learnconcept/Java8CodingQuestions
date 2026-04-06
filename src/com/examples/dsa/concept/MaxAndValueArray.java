package com.examples.dsa.concept;

public class MaxAndValueArray {

    static void main() {
        int [] arr = {16,9,6,13};
        maxAndValueArray(arr);
    }

    private static void maxAndValueArray(int[] arr) {
        int res = 0;
        for(int i =0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if((arr[i] & arr[j]) > res){
                    res = (arr[i] & arr[j]);
                }
            }
        }
        System.out.println(res);
    }
}
