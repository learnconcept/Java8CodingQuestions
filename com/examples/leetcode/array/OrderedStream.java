package com.examples.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class OrderedStream {
    private List<String> streamList;
    private int currentIndex;

    OrderedStream(int n){
        streamList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            streamList.add(null);
        }
        currentIndex =0;
    }

    public List<String> insert(int idKey, String value) {
        streamList.set(idKey - 1, value);
        List<String> result = new ArrayList<>();
        while(currentIndex < streamList.size() && streamList.get(currentIndex)!=null){
            result.add(streamList.get(currentIndex));
            currentIndex ++;
        }
        return result;
    }

    public static void main(String[] args) {
        OrderedStream os = new OrderedStream(5);

        System.out.println(os.insert(3, "c")); // Empty (no segment complete)
        System.out.println(os.insert(1, "a")); // ["a"]
        System.out.println(os.insert(2, "b")); // ["b", "c"]
        System.out.println(os.insert(5, "e")); // Empty (no segment complete)
        System.out.println(os.insert(4, "d")); // ["d", "e"]
    }
}
