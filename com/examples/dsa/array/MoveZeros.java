package com.examples.dsa.array;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] array = {8,1,2,0,1,0,3};

        int zeroNum = 0;
        int temp = 0;
        for(int i=0; i<array.length;i++){
            if(array[i]!=0 && array[zeroNum]==0){
                temp = array[i];
                array[i] = array[zeroNum];
                array[zeroNum] = temp;
            }
            if(array[zeroNum]!=0){
                zeroNum++;
            }
        }
        Arrays.stream(array).forEach(System.out::print);
    }
}
