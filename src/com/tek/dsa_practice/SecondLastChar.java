package com.tek.dsa_practice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SecondLastChar {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("Java", "Spring", "Microservice", "SQL");
        List<Character> result=words.stream()
                .filter(word->word.length()>2)
                .map(word->word.charAt(word.length()-2))
                .collect(Collectors.toList());
        System.out.println("Second last characters of the words are "+result);
    }
}
