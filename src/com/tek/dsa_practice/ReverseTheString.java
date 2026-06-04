package com.tek.dsa_practice;

import java.util.Scanner;

public class ReverseTheString {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the string");
        String input=scn.nextLine();
        String reverse="";
        for(int i=input.length()-1;i>=0;i--){
            reverse+=input.charAt(i);
        }
        System.out.println("Reverse of the string is "+reverse);
    }
}
