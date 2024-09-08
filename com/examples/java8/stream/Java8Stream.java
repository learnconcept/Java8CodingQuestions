package com.examples.java8.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Stream {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 24, 21, 67, 32, 59);
        // List of Odd and Even
        Map<Boolean, List<Integer>> oddorEven = listOfIntegers.stream().collect(Collectors.partitioningBy(i-> i%2==0));

       List<Integer> even = oddorEven.get(true);
       List<Integer> odd = oddorEven.get(false);

       System.out.println(even);
       System.out.println(odd);

       // Remove duplicate
        System.out.println("Remove duplicate");
        List<String> listOfStrings = Arrays.asList("Java", "Python", "Java", "Java", "AWS", "Python");
        List<String> uniqueString = listOfStrings.stream().distinct().collect(Collectors.toList());
        uniqueString.forEach( s-> System.out.println(s));

        //find frequency of each character in a string using Java 8 streams
        System.out.println("find frequency of each character in a string using Java 8 streams");
        String findFrequency= "Hello this is java8 streams";
        Map<Character, Long> freqMap = findFrequency.chars().mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        freqMap.forEach((k,v)-> System.out.println(k+" "+v) );

        // How do you find frequency of each element in an array or a list?
        System.out.println("Find frequency of words");
        List<String> list = Arrays.asList("java","python","java","microservices","microservices","docker","rust");
        Map<String, Long> wordsFreq = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        wordsFreq.forEach((k,v)->System.out.println(k+" "+v));

        //Sort given list of decimals
        System.out.println("Sort given list of decimals");
        List<Double> decimalList = Arrays.asList(54.2, 3.58, 1.13, 42.9, 63.8, 71.85, 65.8, 1.1);
        decimalList.stream().sorted(Comparator.reverseOrder()).forEach(s-> System.out.println(s));

        //list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter
        System.out.println("list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter");
        List<String> listJoin = Arrays.asList("Java", "Python", "Groovy", "JavaScript", "AWS", "Azure");
        String joinedString = listJoin.stream().collect(Collectors.joining(", ", "[", "]"));
        listOfStrings.stream().collect(Collectors.joining(", ", "[", "]"));
        System.out.println(joinedString);

        // list of integers, print the numbers which are multiples of 5
        System.out.println("list of integers, print the numbers which are multiples of 5");
        List<Integer> intList = Arrays.asList(50,23,40,78,10);
        intList.stream().filter(i->i%5==0).collect(Collectors.toList()).forEach(System.out::println);

        // find max and min of list integers
        int max = intList.stream().max(Comparator.naturalOrder()).get();
        int min = intList.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Max "+max+" "+"Min "+min);

        //Merge 2 unsorted array to single sorted array
        System.out.println("Merge 2 unsorted array to single sorted array");
        int[] a = new int[] {14, 2, 75, 10, 75};
        int[] b = new int[] {81, 32, 99, 59, 32};
        int[] sort = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().toArray();
        Arrays.stream(sort).forEach(s->System.out.println(s));

        //merge two unsorted arrays into single sorted array without duplicates
        System.out.println("Merge two unsorted arrays into single sorted array without duplicates");
        int[] distinctArray = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
        Arrays.stream(distinctArray).forEach(s->System.out.println(s));

        //three maximum numbers and three minimum numbers from the given list of integers
        System.out.println("Find 3 max and 3 min from given list of Integer");
        List<Integer> findMinMax = Arrays.asList(50, 21, 90, 56, 11, 98, 23,40,78,10);
        findMinMax.stream().sorted(Comparator.naturalOrder()).limit(3).forEach(System.out::println);
        System.out.println("max 3");
        findMinMax.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

        //program to check if two strings are anagrams or not
        System.out.println("Program to check if two strings are anagrams or not");
        String str1 = "Gainly";
        String str2 = "Laying";
        String s1 = Stream.of(str1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        String s2 = Stream.of(str2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        System.out.println("String are anagrams? "+s1.equals(s2));

        //sum of all digits of a number in Java 8
        System.out.println("sum of all digits of a number in Java 8");
        int num = 3245;
        int numSum = Stream.of(String.valueOf(num).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(numSum);

        //second largest in Integer array
        System.out.println("Second largest in given array");
        List<Integer> findSecLar = Arrays.asList(50, 21, 90, 56, 11, 98, 23,40,78,10);
        int findSecondLarge = findSecLar.stream().sorted().skip(1).findFirst().get();
        System.out.println(findSecondLarge);

        //list of strings, sort them according to increasing order of their length
        System.out.println("list of strings, sort to increasing order of their length");
        List<String> courses = Arrays.asList("Java", "Python", "Groovy", "JavaScript", "AWS", "Azure");
        courses.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

        // integer array, find sum and average of all elements
        System.out.println("Find sum and average of all elements");
        int[] arr = new int[] {14, 2, 75, 10, 75};
        int sumArr = Arrays.stream(arr).sum();
        double avgArr = Arrays.stream(arr).average().getAsDouble();
        System.out.println("Sum array "+sumArr+" Avg arr "+avgArr);

        // find common elements between two arrays
        System.out.println("find common elements between two arrays");
        int[] a1 = new int[] {14, 32, 75, 10, 75};
        int[] b1 = new int[] {81, 32, 75, 99, 59, 32};














    }
}
