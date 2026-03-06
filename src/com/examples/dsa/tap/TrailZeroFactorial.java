package com.examples.dsa.tap;

public class TrailZeroFactorial {
    static void main() {
        int num = 200;
        int count = 0;
        int pof5 = 5;

        while(num>= pof5) {
            count = count + num / pof5;
            pof5 = pof5 * 5;
        }
        System.out.println(count);
    }
}
