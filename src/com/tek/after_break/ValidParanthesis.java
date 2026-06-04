package com.tek.after_break;

import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the String of paranthesis :");
        String input=scn.nextLine();
        if(isValidParanthesis(input)){
            System.out.println("The paranthesis is valid");
        }else{
            System.out.println("The paranthesis is not valid");
        }
    }
    public static boolean isValidParanthesis(String input){
        Stack<Character> heap=new Stack<>();
        for(char ch:input.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                heap.push(ch);
            }else{
                if(heap.isEmpty()) return false;
                char top=heap.pop();
                if((ch==')' && top!='(') || (ch=='}' && top!='{') || (ch==']' && top!='[')){
                    return false;
                }
            }
        }
        return heap.isEmpty();
    }
}
