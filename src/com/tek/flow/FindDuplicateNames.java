package com.tek.flow;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class FindDuplicateNames {
    public static void main(String[] args) {
        List<String> names=List.of(  "Manoj", "Amit", "Rahul", "Amit", "John", "Manoj");
        Set<String> unique=new HashSet<>();
        List<String> duplicates=names.stream()
                .filter(name->!unique.add(name))
                .collect(Collectors.toList());
        System.out.println(duplicates);
    }
}
