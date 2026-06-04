package com.tek.classroom.streams;

import java.util.*;

public class FindMax {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 25, 5, 40, 15);

        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo);

        System.out.println(max);
    }
}
