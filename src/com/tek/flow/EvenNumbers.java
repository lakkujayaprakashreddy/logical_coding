package com.tek.flow;

import java.util.List;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,3,4,5,6,8,9,0);
        numbers.stream()
                .filter(n->n%2==0)
                .forEach(System.out::println);
    }
}
