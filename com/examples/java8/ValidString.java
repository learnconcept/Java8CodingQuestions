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
            } else{
                System.out.println("Is not valid string");
            }
        }
        if(stack.isEmpty()){
            System.out.println("Is valid string");
        }
    }
}
