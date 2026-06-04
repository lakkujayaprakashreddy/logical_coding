package com.tek.classroom.streams;

import java.util.*;
import java.util.stream.Collectors;

public class ConvertList {

    public static void main(String[] args) {

        List<String> data = Arrays.asList("1", "2", "3");

        List<Integer> numbers = data.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(numbers);
    }
}
