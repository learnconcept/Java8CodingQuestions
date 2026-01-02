package com.examples.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WordCollection {
    public static void main(String[] args) {
        String str = "Hello World How Are You";
        HashMap<Character, List<String>> hmap= new HashMap<>();
        String array[] = str.split("\\s");
        for(String s: array){
            Character ch = Character.toUpperCase(s.charAt(0));
            if(Character.isLetter(ch)){
                hmap.computeIfAbsent(ch, k->new ArrayList<>()).add(s);
            }
        }
        hmap.forEach((k,v)-> System.out.println(k+":"+v));

    }
}
