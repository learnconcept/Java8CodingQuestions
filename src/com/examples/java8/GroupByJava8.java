package com.examples.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByJava8 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList(new String[]{"Pen", "Pencil", "Book", "Headphones"});

        //Find the length of each given string
        list.stream().collect(Collectors.groupingBy(String::length))
                .forEach((k,v)->System.out.println(k+" "+v));
        //Count the number of each items in the given list
        list = Arrays.asList(new String[]{"Pen", "Pencil", "Book", "Headphones",
                "Pen", "Pencil", "Book", "Pen", "Book", "Headphones"});

        Map<String, Long> map =list.stream().collect(Collectors.groupingBy(s->s, Collectors.counting()));
        map.forEach((k,v)->System.out.println(k+" "+v));
    }
}
