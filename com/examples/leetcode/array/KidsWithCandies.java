package com.examples.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.stream;

public class KidsWithCandies {
    public static void main(String[] args) {
        int [] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Integer> number = IntStream.range(0, candies.length)
                .map(i->candies[i]+extraCandies)
                .boxed().collect(Collectors.toList());

        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> booleanList = new ArrayList<>(number.size());
        for(Integer i: number){
            if(i>=max){
                booleanList.add(true);
            }else{
                booleanList.add(false);
            }
        }
        return booleanList;
    }
}
