package com.tek.workout;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateNames {
    public static void main(String[] args) {
        String[] names={  "Manoj", "Amit", "Rahul", "Amit", "John", "Manoj"};
        Set<String> set=new HashSet<>();
        List<String> duplicates=Arrays.stream(names)
                .filter(name->!set.add(name))
                .collect(Collectors.toList());
        System.out.println(duplicates);
    }
}
