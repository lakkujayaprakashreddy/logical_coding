package com.tek.byteridge;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter the String to be reversed:");
        String input=scn.nextLine();
        String result=new StringBuilder(input).reverse().toString();
        System.out.println("The Reversed String is :"+result);
    }
}
