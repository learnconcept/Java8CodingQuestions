package com.examples.java8.stream;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Stream {

    public static void main(String[] args) {
     List<Integer> listOfIntegers = Arrays.asList(71, 18, 24, 21, 67, 32, 59);
     // List of Odd and Even
     Map<Boolean, List<Integer>> oddorEven = listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));

     List<Integer> even = oddorEven.get(true);
     List<Integer> odd = oddorEven.get(false);

     System.out.println(even);
     System.out.println(odd);

     // Remove duplicate
     System.out.println("Remove duplicate");
     List<String> listOfStrings = Arrays.asList("Java", "Python", "Java", "Java", "AWS", "Python");
     List<String> uniqueString = listOfStrings.stream().distinct().collect(Collectors.toList());
     uniqueString.forEach(s -> System.out.println(s));

     //find frequency of each character in a string using Java 8 streams
     System.out.println("find frequency of each character in a string using Java 8 streams");
     String findFrequency = "Hello this is java8 streams";
     Map<Character, Long> freqMap = findFrequency.chars().mapToObj(c -> (char) c)
             .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
     freqMap.forEach((k, v) -> System.out.println(k + " " + v));

     // How do you find frequency of each element in an array or a list?
     System.out.println("Find frequency of words");
     List<String> list = Arrays.asList("java", "python", "java", "microservices", "microservices", "docker", "rust");
     Map<String, Long> wordsFreq = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
     wordsFreq.forEach((k, v) -> System.out.println(k + " " + v));

     //Sort given list of decimals
     System.out.println("Sort given list of decimals");
     List<Double> decimalList = Arrays.asList(54.2, 3.58, 1.13, 42.9, 63.8, 71.85, 65.8, 1.1);
     decimalList.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));

     //list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter
     System.out.println("list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter");
     List<String> listJoin = Arrays.asList("Java", "Python", "Groovy", "JavaScript", "AWS", "Azure");
     String joinedString = listJoin.stream().collect(Collectors.joining(", ", "[", "]"));
     listOfStrings.stream().collect(Collectors.joining(", ", "[", "]"));
     System.out.println(joinedString);

     // list of integers, print the numbers which are multiples of 5
     System.out.println("list of integers, print the numbers which are multiples of 5");
     List<Integer> intList = Arrays.asList(50, 23, 40, 78, 10);
     intList.stream().filter(i -> i % 5 == 0).collect(Collectors.toList()).forEach(System.out::println);

     // find max and min of list integers
     int max = intList.stream().max(Comparator.naturalOrder()).get();
     int min = intList.stream().min(Comparator.naturalOrder()).get();
     System.out.println("Max " + max + " " + "Min " + min);

     //Merge 2 unsorted array to single sorted array
     System.out.println("Merge 2 unsorted array to single sorted array");
     int[] a = new int[]{14, 2, 75, 10, 75};
     int[] b = new int[]{81, 32, 99, 59, 32};
     int[] sort = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
     Arrays.stream(sort).forEach(s -> System.out.println(s));

     //merge two unsorted arrays into single sorted array without duplicates
     System.out.println("Merge two unsorted arrays into single sorted array without duplicates");
     int[] distinctArray = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
     Arrays.stream(distinctArray).forEach(s -> System.out.println(s));

     //three maximum numbers and three minimum numbers from the given list of integers
     System.out.println("Find 3 max and 3 min from given list of Integer");
     List<Integer> findMinMax = Arrays.asList(50, 21, 90, 56, 11, 98, 23, 40, 78, 10);
     findMinMax.stream().sorted(Comparator.naturalOrder()).limit(3).forEach(System.out::println);
     System.out.println("max 3");
     findMinMax.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

     //program to check if two strings are anagrams or not
     System.out.println("Program to check if two strings are anagrams or not");
     String str1 = "Gainly";
     String str2 = "Laying";
     String s1 = Stream.of(str1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
     String s2 = Stream.of(str2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
     System.out.println("String are anagrams? " + s1.equals(s2));

     //sum of all digits of a number in Java 8
     System.out.println("sum of all digits of a number in Java 8");
     int num = 3245;
     int numSum = Stream.of(String.valueOf(num).split("")).collect(Collectors.summingInt(Integer::parseInt));
     System.out.println(numSum);

     //second largest in Integer array
     System.out.println("Second largest in given array");
     List<Integer> findSecLar = Arrays.asList(50, 21, 90, 56, 11, 98, 23, 40, 78, 10);
     int findSecondLarge = findSecLar.stream().sorted().skip(1).findFirst().get();
     System.out.println(findSecondLarge);

     //list of strings, sort them according to increasing order of their length
     System.out.println("list of strings, sort to increasing order of their length");
     List<String> courses = Arrays.asList("Java", "Python", "Groovy", "JavaScript", "AWS", "Azure");
     courses.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

     // integer array, find sum and average of all elements
     System.out.println("Find sum and average of all elements");
     int[] arr = new int[]{14, 2, 75, 10, 75};
     int sumArr = Arrays.stream(arr).sum();
     double avgArr = Arrays.stream(arr).average().getAsDouble();
     System.out.println("Sum array " + sumArr + " Avg arr " + avgArr);

     // find common elements between two arrays
     System.out.println("find common elements between two arrays");
     Integer[] a1 = new Integer[]{14, 32, 75, 10, 75};
     Integer[] b1 = new Integer[]{81, 32, 75, 99, 59, 32};

     List listA = Arrays.asList(a1);
     List listB = Arrays.asList(b1);
     listA.stream().filter(listB::contains).forEach(System.out::println);

     //Reverse each word of a string using Java 8 streams
     System.out.println("Reverse each word of a string using Java 8 streams");
     String str = "Learning Java8 streams";
     String revers = Arrays.stream(str.split(" ")).map(word -> new StringBuffer(word).reverse())
             .collect(Collectors.joining(" "));
     System.out.println(revers);

     //find sum of first 10 natural numbers
     System.out.println("find sum of first 10 natural numbers");
     int sum = IntStream.range(1, 11).sum();
     System.out.println(sum);

     //Reverse an integer array
     System.out.println("Reverse an Integer Array");
     int[] array = new int[]{15, 10, 77, 93, 49, 6};
     int[] reveseArray = IntStream.rangeClosed(1, array.length)
             .map(i -> array[array.length - i]).toArray();
     Arrays.stream(reveseArray).forEach(System.out::println);

     //Print first 10 even numbers
     System.out.println("Print first 10 even numbers");
     IntStream.rangeClosed(1, 10).map(i -> i * 2).forEach(System.out::println);

     //How do you find the most repeated element in an array?
     System.out.println("How do you find the most repeated element in an array?");
     int[] repatedArray = new int[]{15, 6, 10, 77, 93, 77, 49, 6};
     Map<Integer, Long> integerLongMap = Arrays.stream(repatedArray).boxed()
             .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
     int mostRepeted = integerLongMap.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
     System.out.println(mostRepeted);

     //Palindrome program using java 8 streams
     String isPalin = "ROTATOR";
     boolean palinCheck = IntStream.range(0, isPalin.length() / 2)
             .noneMatch(i -> isPalin.charAt(i) != isPalin.charAt(isPalin.length() - i - 1));
     System.out.println(palinCheck);

     //Palindrome program using java 8 streams for an integer
     System.out.println("Palindrome program using java 8 streams for an integer");
     Integer isPalinNum = 2332;
     String strPalin = String.valueOf(isPalinNum);
     boolean palinStrCheck = IntStream.range(0, strPalin.length()/2)
             .noneMatch(i->strPalin.charAt(i) !=strPalin.charAt(strPalin.length()-i-1));
     System.out.println(palinStrCheck);

     //Using / and %
     int num2 = isPalinNum;
     Integer reverse = 0;
     while(num2>0){
      int lastDigit = num2%10;
      reverse = reverse *10 + lastDigit;
      num2 = num2/10;
     }
     System.out.println(reverse == isPalinNum);


     //Given a list of strings, find out those strings which start with a number
     System.out.println("Given a list of strings, find out those strings which start with a number");
     List<String> stringList = Arrays.asList("2Java", "4Python", "Groovy", "JavaScript", "3AWS", "Azure");
     stringList.stream().filter(s -> Character.isDigit(s.charAt(0))).forEach(System.out::println);

     // How do you extract duplicate elements from an array
     int[] array2 = new int[]{15, 6, 10, 77, 93, 77, 49, 6};
     Map<Integer, Long> mapInt = Arrays.stream(array2).boxed()
             .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
     List listDuplicate = mapInt.entrySet().stream().filter(i->i.getValue()>1)
             /*.map(Map.Entry::getKey)*/.collect(Collectors.toList());
     System.out.println(listDuplicate);

     //Swap 2 nums without 3rd variables
     int a2=33;
     int b2=23;

     b2= a2+b2;
     a2= b2-a2;
     b2 = b2-a2;
     System.out.println(a2+" "+b2);

     // find second largest from given array
     System.out.println("find second largest from given array");
     int secondLargest = Arrays.stream(array2).boxed().distinct()
             .sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
     System.out.println(secondLargest);

     //Print duplicate characters in a string?
     System.out.println("Print duplicate characters in a string?");
     String dupChar = "abcdaedf";
     Set set = new HashSet();
     Arrays.stream(dupChar.split(""))
             .filter(i->!set.add(i))
             .collect(Collectors.toSet())
             .forEach(System.out::println);

     //find first repeated character in given string
     System.out.println("find first repeated character in given string");
     Map<String, Long> mapChars = Arrays.stream(dupChar.split(""))
             .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
              Collectors.counting()));
     String firstRepeated = mapChars.entrySet().stream()
             .filter(entry -> entry.getValue()>1)
             .map(key->key.getKey())
             .findFirst().get();
     System.out.println(firstRepeated);

     //Find first non-repeated character in a string?
     System.out.println("Find first non-repeated character in a string");
     Map<String, Long> mapNonRepeated = Arrays.stream(dupChar.split(""))
             .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
     String firstNonRepeated = mapNonRepeated.entrySet().stream()
             .filter(i->i.getValue()==1).map(i->i.getKey()).findFirst().get();
     System.out.println(firstNonRepeated);

     //Find first 10 odd numbers using Streams
     System.out.println("Find first 10 odd numbers using Streams");
     IntStream.rangeClosed(1, 20).filter(i->i%2!=0).boxed().collect(Collectors.toList()).forEach(System.out::println);

     //How do you get last element of an array
     System.out.println("How do you get last element of an array");
     List<String> listStrings = Arrays.asList("One", "Two", "Three", "Four", "Five");
     String findLast = listStrings.stream().skip(listStrings.size()-1).findFirst().get();
     System.out.println(findLast);

     //Find the age of a person in years if the birthday has given
     System.out.println("Find the age of a person in years if the birthday has given");
     LocalDate birthDay = LocalDate.of(1985, 9, 02);
     long years = ChronoUnit.YEARS.between(birthDay, LocalDate.now());
     System.out.println(years);

     //Remove last repetative character
     System.out.println("Remove last repetative character");
     String removeLastRepeat = "Remove last repetative character";
     Map<Character, Long> frequency = removeLastRepeat.chars().mapToObj( c -> (char)c)
             .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
     StringBuilder sb = new StringBuilder(removeLastRepeat);
     for(int i = removeLastRepeat.length() -1; i>=0; i--){
      char c = removeLastRepeat.charAt(i);
      if(frequency.get(c)>1){
       sb.deleteCharAt(i);
       break;
      }
     }
     System.out.println(removeLastRepeat+": "+sb.toString());
     }
}
