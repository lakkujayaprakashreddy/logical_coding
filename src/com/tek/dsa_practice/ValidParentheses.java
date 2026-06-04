package com.tek.dsa_practice;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a string of parentheses:");
        String input=scn.nextLine();
        if(isValid(input)){
            System.out.println("The parentheses are valid.");
        }else {
            System.out.println("The parentheses are not valid.");
        }
    }
    public static boolean isValid(String input){
        Queue<Character> heap=new PriorityQueue<>();
        for(char c:input.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                heap.offer(c);
            }else{
                if(heap.isEmpty()){
                    return false;
                }
                char top=heap.peek();
                if(top!='(' && c==')' || top!='{' && c=='}' ||top!='[' && c==']' ) {
                    return false;
                }
            }
        }
        return heap.isEmpty();
    }
}
