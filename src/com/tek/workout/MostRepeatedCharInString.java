package com.tek.workout;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MostRepeatedCharInString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the String to be converted:");
        String input = scn.nextLine();
        Optional<Character> mostRepeated= input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey);

        System.out.println(mostRepeated);
    }
}
