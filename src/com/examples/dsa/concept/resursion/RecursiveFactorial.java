package com.examples.dsa.concept.resursion;

public class RecursiveFactorial {
    static int factorial(int n)
    {
        if(n == 1 || n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    static void main() {
        Integer value = factorial(3);
        System.out.println(value);
    }
}
