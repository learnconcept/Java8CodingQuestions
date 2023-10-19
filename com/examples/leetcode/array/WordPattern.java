package com.examples.leetcode.array;

import java.util.HashMap;

public class WordPattern {

    public static void main(String[] args) {
        String pattern = "abba", s = "dog dog dog dog";
        System.out.println(wordPattern(pattern, s));

    }
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split("\\s");
        HashMap<Character, String> hashMap = new HashMap<>();
        if (pattern.length() == words.length) {
            for (int i = 0; i < pattern.length(); i++) {
                if (!hashMap.containsKey(pattern.charAt(i)) &&
                        !hashMap.containsValue(words[i])) {
                    hashMap.put(pattern.charAt(i), words[i]);
                }
            }
            int i=pattern.length();
               while(i>0){
                   i--;
                   if(!words[i].equals(hashMap.get(pattern.charAt(i))))
                    return false;
                }
               return true;
        }
        return false;
    }
}
