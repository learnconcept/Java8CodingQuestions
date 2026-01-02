package com.examples.dsa.array;

public class SecondMax {
    public static void main(String[] args) {
        int[] array = {13,34,2,34,33,1};
        // find second max which has duplicate max
        Integer max = Integer.MIN_VALUE;
        Integer secondMax = Integer.MIN_VALUE;

        for(int i=0; i<array.length; i++){
            if(array[i]>max){
                secondMax = max;
                max=array[i];
            } else if (array[i]>secondMax && array[i]!=max) {
                secondMax = array[i];
            }
        }
        System.out.println(secondMax);
    }
}
