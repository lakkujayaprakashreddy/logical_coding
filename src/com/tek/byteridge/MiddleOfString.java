package com.tek.byteridge;

import java.util.Scanner;

public class MiddleOfString {
    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Please enter the String to be reversed:");
            String input = scn.nextLine();
        char result=input.chars()
                .mapToObj(c->(char)c)
                .skip(input.length()/2)
                .findFirst()
                .orElseThrow(()->new RuntimeException("String is Empty"));
        System.out.println(result);
    }
}
