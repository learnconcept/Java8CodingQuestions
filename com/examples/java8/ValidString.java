package com.examples.java8;

import java.util.Stack;

public class ValidString {
    public static void main(String[] args) {
        String isValid = "(){[(((}})]}";

        char[] str = isValid.toCharArray();

        Stack<Character> stack = new Stack<>();
        for(char c: str){
            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
            } else if (c==')' && !stack.isEmpty() && '('==stack.peek()) {
                stack.pop();
            } else if (c=='}' && !stack.isEmpty() && '{'==stack.peek()) {
                stack.pop();
            } else if (c==']' && !stack.isEmpty() && '['==stack.peek()) {
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            System.out.println(isValid+" Is valid string");
        } else {
            System.out.println(isValid+" Is not valid string");
        }
    }
}
