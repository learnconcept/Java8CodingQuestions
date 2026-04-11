package com.examples.dsa.concept.resursion;

public class JosephsKill {
    static void main() {
        String[] str={"A","B","C","D","E","F","G"};
        System.out.println(str[josephsKill(str.length, 3)]);

    }

    private static int josephsKill(int length, int k) {
        if(length==1){
            return 0;
        }
        return (josephsKill(length-1,k)+k)%length;
    }
}
