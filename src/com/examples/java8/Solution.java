package com.examples.java8;

import java.util.HashSet;
// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N, String S) {
        // Implement your solution here
        Set reservedSeat = new HashSet();
        String[] reservSeat = S.split(" ");
        for(String seat: reservSeat){
            reservedSeat.add(seat);
        }

        int count=0;

        for(int rowNum=1; rowNum<=N; rowNum++){
            if(checkFamilySeats(rowNum, reservedSeat)){
                count++;
            }
        }
        return count;
    }

    private boolean checkFamilySeats(int row, Set<String> reservedSeat) {
        for (int seat = 1; seat <= 8; seat += 4) {
            String seatString1 = String.valueOf((char) ('A' + seat - 1));
            String seatString2 = String.valueOf((char) ('A' + seat + 2));

            if ("I".equals(seatString1) || "I".equals(seatString2)) {
                continue;
            }
            if (reservedSeat.contains(row + seatString1) || reservedSeat.contains(row + seatString2)) {
                return false;
            }
        }
        return true;
    }
}
