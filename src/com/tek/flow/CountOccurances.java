package com.tek.flow;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountOccurances {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter the String to be reversed:");
        String input=scn.nextLine();
        Map<Character, Long> result=input.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println("The count of each character is :"+result);
    }
}
