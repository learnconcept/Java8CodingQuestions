package com.examples.dsa.array;

import java.util.stream.IntStream;

public class PalindromString {

    public static void main(String[] args) {
        String word = "madam";

        char[] wordArray = word.toCharArray();
        boolean isPalindrome  = true;
        int start = 0;
        int end = word.length()-1;
        while (start < end){
            if(wordArray[start]!=wordArray[end]){
                isPalindrome = false;
                break;
            }
                start++;
                end--;
        }
        System.out.println(word+" "+isPalindrome);

        // Using Java 8
        isPalindrome = IntStream.range(0, word.length()/2).allMatch(i->word.charAt(i) == word.charAt(word.length()-i-1));
        System.out.println("Using Java 8 "+isPalindrome);

    }
}
