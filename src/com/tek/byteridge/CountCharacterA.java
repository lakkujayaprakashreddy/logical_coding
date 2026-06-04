package com.tek.byteridge;

import java.util.Scanner;

public class CountCharacterA {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the String to be reversed:");
        String input = scn.nextLine();
        Long result=input.chars()
                .mapToObj(c->(char)c)
                .filter(c->c=='a' || c=='A')
                .count();
        System.out.println("The e count of character a or A is :"+result);
    }
}
