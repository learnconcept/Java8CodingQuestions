package com.examples.leetcode.array;

public class IsAcronym {

    public static void main(String[] args) {
        String[] words = {"an","apple"};
        String s = "a";
        String firstLetter ="";
        for(String word: words){
            firstLetter+=word.substring(0,1);
        }

        System.out.println(s.equalsIgnoreCase(firstLetter));
    }
}
