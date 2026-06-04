package com.tek.GeekyAnts;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String input="Hello, World!";
        String reversed=reverseString(input);
        System.out.println("Original String: "+input);
        System.out.println("Reversed String: "+reversed);
    }
    public static String reverseString(String input){
        Stack<Character> stack=new Stack<>();
        for(char ch:input.toCharArray()){
            stack.push(ch);
        }
        StringBuilder result=new StringBuilder();
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        return result.toString();
    }
}
