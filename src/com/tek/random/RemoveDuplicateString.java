package com.tek.random;

import java.util.stream.Collectors;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        String str="Programming";
        String result = str.chars().mapToObj(c -> (char) c).map(String::valueOf).distinct().collect(Collectors.joining());
        System.out.println(result);
    }
}
