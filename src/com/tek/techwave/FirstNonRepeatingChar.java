package com.tek.techwave;

import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str="sSwiss".toLowerCase();
        Character c1 = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println(c1);
    }
}
