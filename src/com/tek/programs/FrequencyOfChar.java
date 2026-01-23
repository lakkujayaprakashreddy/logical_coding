package com.tek.programs;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyOfChar {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        Stream<Integer> integerStream = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(c -> c.getValue() == 1)
                .map(Map.Entry::getKey);
        integerStream.forEach(System.out::println);
    }
}
