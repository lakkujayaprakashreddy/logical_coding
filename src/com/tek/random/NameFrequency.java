package com.tek.random;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NameFrequency {
    public static void main(String[] args) {
        List<String> names = List.of(
                "Manoj", "Amit", "Rahul", "Amit",
                "John", "Manoj", "Amit", "Rahul",
                "Alex", "Maria", "John", "Maria",
                "Chen", "Alex", "Rahul"
        );
        names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().sorted(Comparator.comparing(e->((Map.Entry<String, Long>)e).getValue()).reversed()).forEach(System.out::println);
    }
}
