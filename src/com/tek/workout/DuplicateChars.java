package com.tek.workout;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DuplicateChars {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the String to be converted:");
        String input = scn.nextLine();
        Map<Character, Long> duplicates= input.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(c->c.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(duplicates);
    }
}
