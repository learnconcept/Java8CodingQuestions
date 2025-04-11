package com.examples.java8;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 5, 7, 9};
        int b[] = {2, 6, 8};

        int c[] = new int[a.length + b.length];

        Arrays.stream(mergeArray(a, b)).forEach(i->System.out.println(i));
    }

    private static int[] mergeArray(int[] a, int[] b) {
        int c[] = new int[a.length + b.length];
        int i =0; int j=0; int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k++]=a[i++];
            }else{
                c[k++]=b[j++];
            }
        }
        while(i<a.length){
            c[k++] = a[i++];
        }
        while(j<b.length){
            c[k++]= b[j++];
        }

        return c;
    }
}
