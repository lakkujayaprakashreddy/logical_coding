package com.tek.workout;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the String to be converted:");
        String input = scn.nextLine();
        String result=new StringBuilder(input).reverse().toString();
        System.out.println(result);
    }
}
