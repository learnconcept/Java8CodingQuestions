package com.examples.java8;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class WordHighestLength {

    public static void main(String[] args) {

       String s = "The World is moving in faster Payments we need to imbibe the same";
        //Given a sentence find the word that has the highest length
       String highestLengthWord =Arrays.stream(s.split("\\s+"))
               .max(Comparator.comparing(String::length)).get();
       System.out.println("highestLengthWord: "+highestLengthWord);
        //Given a sentence find the word that has the second-highest length
        String secondLengthWord = Arrays.stream(s.split("\\s+"))
                .sorted(Comparator.comparingInt(String::length).reversed()).skip(1).findFirst().get();
        System.out.println("secondLengthWord: "+secondLengthWord);
        //Find the length of the longest word
        int longestWordLength = Arrays.stream(s.split("\\s"))
                .max(Comparator.comparingInt(String::length)).get().length();
        int longestWordLen = Arrays.stream(s.split("\\s+")).mapToInt(len->len.length()).max().getAsInt();
        System.out.println("longestWordLength "+longestWordLength);
        System.out.println("longestWordLen "+longestWordLen);


    }
}
