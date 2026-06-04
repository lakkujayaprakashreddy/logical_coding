package com.tek.dsa_practice;

import java.util.Map;
import java.util.stream.Collectors;

public class MostRepeatingCharacter {
    public static void main(String[] args) {
        String s = "Proggrrmmiing";
        Map<Character,Long> map= s.chars()
                .mapToObj(c-> (char) c)
                .collect(Collectors.groupingBy(c->c, Collectors.counting()));
        Long mostRepeatingChar=map.values()
                .stream().max(Long::compareTo).orElseThrow(()->new RuntimeException("No characters found"));
        map.entrySet()
                .stream()
                .filter(entry->entry.getValue()==mostRepeatingChar)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

    }
}
