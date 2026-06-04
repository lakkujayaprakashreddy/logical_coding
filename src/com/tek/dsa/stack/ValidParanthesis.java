package com.tek.dsa.stack;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String input="{}({[]})[]";
        boolean result=isValid(input);
        System.out.println("is valid paranthesis:"+result);
    }
    public static boolean isValid(String input){
        Stack<Character> heap=new Stack<>();
        for(char ch:input.toCharArray()){
            if(ch=='{' || ch=='[' || ch=='('){
                heap.push(ch);
            }else{
                if(heap.isEmpty()) return  false;
                char top=heap.pop();
                if(ch=='}' && top!='{' || ch==']' && top!='[' || ch==')' && top!='('){
                    return false;
                }
            }
        }
        if(!heap.isEmpty()) {
            return false;
        }else {
            return true;
        }
    }
}
