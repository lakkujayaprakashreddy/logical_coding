package com.tek.workout;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMinAndMax {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9,10);
        Optional<Integer> min=numbers.stream().min(Comparator.comparing(Integer::intValue));
        Optional<Integer> max=numbers.stream().max(Comparator.comparing(Integer::intValue));
        System.out.println(min.orElseThrow(()->new RuntimeException("List is Empty")));
        System.out.println(max.orElseThrow(()->new RuntimeException("List is Empty")));
    }
}
