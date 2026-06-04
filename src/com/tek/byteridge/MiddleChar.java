package com.tek.byteridge;

import java.util.Scanner;

public class MiddleChar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the String to be reversed:");
        String input = scn.nextLine();
        int i = input.chars().skip(input.length() / 2)
                .findFirst()
                .orElseThrow();
        System.out.println((char)i);
    }
}
