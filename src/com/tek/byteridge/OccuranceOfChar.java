package com.tek.byteridge;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OccuranceOfChar {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter the String to be reversed:");
        String input=scn.nextLine();
        java.util.Map<Character,Long> occurance= input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(occurance);
    }
}
