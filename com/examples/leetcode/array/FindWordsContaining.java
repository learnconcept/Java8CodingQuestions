package com.examples.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContaining {

    public static void main(String[] args) {
        String[] words = {"leet","code"};
        char x = 'e';
        ArrayList<Integer> indexes = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            for(int j =0; j<words[i].length(); j++){
                String check = words[i];
                if(words[i].charAt(j) == x){
                    indexes.add(i);
                    break;
                }
            }
        }
        System.out.println(indexes);
    }
}
