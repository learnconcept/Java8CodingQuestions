package com.examples.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindTheTrip {

    public static void main(String[] args) {
        List<String> tripTickets = Arrays.asList("KOL-BOM", "BOM-DEL", "HYD-KOL");
        //Find Source and destination
        HashMap<String, String> hashMap = new HashMap<>();
        for(String s: tripTickets){
            String [] str = s.split("-");
            hashMap.put(str[0], str[1]);
        }

        String source = null;
        //Find the source
        for(String start: hashMap.keySet()){
            if(!hashMap.containsValue(start)){
                source = start;
                break;
            }
        }

        String destination = null;
        //Find the source
        for(String end: hashMap.values()){
            if(!hashMap.containsKey(end)){
                destination = end;
                break;
            }
        }
        System.out.println(source+" is source "+destination+" is the destination");

        //Find complete trip
        String current = source;
        ArrayList<String> stationList = new ArrayList<>();
        stationList.add(source);
        int count = hashMap.size();
        while(count!=0){
            if(hashMap.containsKey(current)){
                stationList.add(hashMap.get(current));
                current = hashMap.get(current);
                count--;
            }
        }
        for(int i =0; i< stationList.size()-1; i++){
            System.out.println(stationList.get(i)+"-->"+stationList.get(i+1));
        }




        

    }
}
