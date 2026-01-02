package com.examples.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMissingAndDuplicate {

    public static void main(String[] args) {

        int array[] = {24, 20, 25,21,22, 24, 25};

        //convert array to list
        List<Integer> numberList = Arrays.stream(array).boxed().collect(Collectors.toList());

        //finding duplicates
        List<Integer> duplicates = numberList.stream()
                .filter(dup -> numberList.indexOf(dup) != numberList.lastIndexOf(dup))
                .distinct().collect(Collectors.toList());
        System.out.println(duplicates);

        //find missing numbers
        Set<Integer> set = Arrays.stream(array).boxed().collect(Collectors.toSet());
        int min = Collections.min(set);
        int max = Collections.max(set);

        List<Integer> missingNum = IntStream.range(min, max).filter(num -> !set.contains(num))
                .boxed().collect(Collectors.toList());
        System.out.println(missingNum);

    }
}
