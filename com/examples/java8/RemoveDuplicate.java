package com.examples.java8;

import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {
        String str = "hddussskae";
        str.chars()
                .distinct()
                .mapToObj(s->(char) s)
                .forEach(System.out::print);
        System.out.println("\n");
        Arrays.stream(str.split(""))
                .distinct().forEach(System.out::print);
    }
}
