package com.tek.classroom;

import java.util.Scanner;

public class Palindome {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a string:");
        String input=scn.nextLine();
        if(isPalindome(input)){
            System.out.println("The string is a palindrome.");
        }else {
            System.out.println("The string is not a palindrome.");
        }
    }
    public static boolean isPalindome(String input){
        int left=0;
        int right=input.length()-1;
        while(left<right){
            if(input.charAt(left)!=input.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
