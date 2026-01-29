package com.tek.techwave;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FruitSortJava8 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Papaya", "Banana", "Orange", "Grapes");
        List<String> ascendingFruits=fruits.stream()
                .sorted()
                .collect(Collectors.toList());
        List<String> descendingFruits=fruits.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Ascending Order: "+ascendingFruits);
        System.out.println("Descending Order: "+descendingFruits);
    }
}
