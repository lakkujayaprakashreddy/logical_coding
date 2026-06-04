package com.tek.workout;

import java.util.Scanner;

public class LongestPalindomeSubstring {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter the String to be converted:");
        String input=scn.nextLine();
        String longestPalindrome=" ";
        for (int i=0;i<input.length();i++){
            for(int j=i+1;j<input.length();j++){
               if( isPalindrome(input.substring(i,j))){
                   if(longestPalindrome.length()<input.substring(i,j).length()) longestPalindrome=input.substring(i,j);
               }
            }
        }
        System.out.println(longestPalindrome);
    }
    public static boolean isPalindrome(String input){
        return new StringBuffer(input).reverse().toString().equals(input);
    }
}
