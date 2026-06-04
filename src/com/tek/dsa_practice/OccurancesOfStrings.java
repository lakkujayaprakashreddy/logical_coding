package com.tek.dsa_practice;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurancesOfStrings {
    public static void main(String[] args) {
        String str="hello world hello";
        Map<String, Long> map=Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(word->word,Collectors.counting()));
        System.out.println(map);
    }
}
