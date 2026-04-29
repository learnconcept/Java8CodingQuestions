package com.examples.dsa.concept.resursion;

public class RecurRopeCut {
    static void main() {
        System.out.println(findMaxPieces(16, 8, 5, 4));
    }

    private static int findMaxPieces(int n, int a, int b, int c) {
        if(n == 0){
            return 0;
        }else if(n <0) {
            return -1;
        }
        int temp1 = findMaxPieces(n-a, a,b,c);
        int temp2 = findMaxPieces(n-b, a,b,c);
        int temp3 = findMaxPieces(n-c, a,b,c);

        int pieces = Math.max(Math.max(temp1, temp2), temp3);
        if(pieces == -1)
        {
            return -1;
        }
        return pieces+1;
    }
}
