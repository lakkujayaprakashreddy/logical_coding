package com.tek.byteridge;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the String to be reversed:");
        String input = scn.nextLine();
        char result= input.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(c->c.getValue()==1)
                . map(Map.Entry::getKey)
                .findFirst()

                .orElseThrow(()->new RuntimeException("No Non repeating character found"));
        System.out.println("The first non repeating character is :"+result);
    }
}
