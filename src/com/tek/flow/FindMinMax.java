package com.tek.flow;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMinMax {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Optional<Integer> min=numbers.stream().min(Integer::compareTo);
        Optional<Integer> max=numbers.stream().max(Integer::compareTo);
        System.out.println(min.orElseThrow(()->new RuntimeException("List is Empty")));
        System.out.println(max.orElseThrow(()->new RuntimeException("List is Empty")));
        int minInt=numbers.stream().min(Integer::compareTo).orElseThrow(()->new RuntimeException("List is Empty"));
        int maxInt=numbers.stream().max(Integer::compareTo).orElseThrow(()->new RuntimeException("List is Empty"));
   }
}


