package com.tek.dsa_practice;

import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MaxOccurringChar {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a string:");
        String input=scn.nextLine();
        char result=input.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElseThrow(()->new RuntimeException("No characters found"));
        System.out.println("The maximum occurring character is: "+result);
    }
}
