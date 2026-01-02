package com.examples.java8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;

public class GartnerQuestions {

    static  int i;
    static int size = 20;
    public static void main(String[] args) {
        //Quesiton 1
        String str = "she sells sea shells";
        String rex = "SsS";
        String replace = "X";
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(rex);
        Matcher matcher = pattern.matcher(str);
        String val = matcher.replaceAll(replace);
        System.out.println(val);

        //Quesiton 2
        int [] arr = new int[size];
        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
        }

        //Quesiton 3
        try {
            if (args.length == 0) {
                return;
            }
                for (int i = 0; i < args.length && i<3; i++) {
                    System.out.print(args[i]+" ");
                }

        } finally {
            System.out.println(": Test Started");
        }

        Set<Integer> mySet = new HashSet<>();
        mySet.add(51);
        mySet.add(61);
        mySet.add(71);
        System.out.println(mySet);
    }

}
