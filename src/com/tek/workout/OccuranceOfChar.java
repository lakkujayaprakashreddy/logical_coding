package com.tek.workout;

import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OccuranceOfChar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the String to be converted:");
        String input = scn.nextLine();
        Map<Character, Long> freq=input.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c, Collectors.counting()));
        System.out.println(freq);
    }
}
