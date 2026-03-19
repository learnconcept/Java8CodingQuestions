package com.examples.dsa.concept;

public class FindFactorial {

    static void main() {
        int num = 3;
        int res = 1;
        for(int i=2; i<=num; i++){
            res = res * i;
        }
        System.out.println(res);
    }
}
