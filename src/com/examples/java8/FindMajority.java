package com.examples.java8;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class FindMajority {
    // Find Majority element in array. A majority element in an
    // array A[] of size n is an element that appears more than n/2 times

    public static void main(String[] args) {
        int[] num = {3,3,4,2,4,4,2,4,4};
        int size=num.length/2;

        HashMap<Integer, Integer> majority = new HashMap<>();

        for(int n: num){
            if(majority.containsKey(n)){
                majority.put(n,majority.get(n)+1);
            }else{
                majority.put(n, 1);
            }
        }

       Set<Integer> set=majority.keySet();
        for(Integer s: set){
            if(majority.get(s)> size){
                System.out.println(s);
            }
        }
    }
}
