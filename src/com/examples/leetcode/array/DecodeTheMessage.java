package com.examples.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class DecodeTheMessage {

    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";

        System.out.println(decodeMessage(key, message));
    }

    public static String decodeMessage(String key, String message) {
        HashMap<Character, Character> letters = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        key = key.replaceAll(" ", "");
        char original = 'a';
        /*for(int i =0; i<key.length(); i++){
            letters.putIfAbsent(key.charAt(i), original++);
        }*/

        for (int i = 0; i < key.length() ; i++) {
            if (!letters.containsKey(key.charAt(i))){
                letters.put(key.charAt(i),original++);
            }
        }
        for(int i =0; i<message.length(); i++){
            if(letters.containsKey(message.charAt(i))){
                sb.append(letters.get(message.charAt(i)));
            }else{
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
