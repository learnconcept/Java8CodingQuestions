package com.examples.dsa.concept.resursion;

public class RecurFindSubSetSum {
    static void main() {
        int [] arr = {10,20,15,5};
        int n = arr.length;
        int sum = 25;
        int count = 0;
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i]+arr[j]==sum){
                    count++;
                }
            }
        }
        System.out.println(count);
        // Using recursive
        System.out.println(countSubSet(arr, sum, 0));
    }

    private static int countSubSet(int[] arr, int sum, int i) {
        if(sum==0){
            return 1;
        }
        if(sum<0){
            return 0;
        }
        if(i==arr.length){
            return 0;
        }
        return countSubSet(arr, sum-arr[i], i+1)
                        +
                countSubSet(arr, sum, i+1);

    }
}
