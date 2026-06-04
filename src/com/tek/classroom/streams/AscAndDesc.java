package com.tek.classroom.streams;

import java.util.*;
import java.util.stream.Collectors;

public class AscAndDesc {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 3);

        List<Integer> ascending = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Ascending: " + ascending);

        List<Integer> descending = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Descending: " + descending);
    }
}