package com.tek.dsa_practice;

import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondNonRepeatingChar {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the String:");
        String input=scn.next();
        char result= input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No second non-repeating character found"));

        System.out.println(result);
    }
}
