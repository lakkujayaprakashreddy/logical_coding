package com.tek.abc;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FifthElementInList {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer result= list.stream()
                .skip(4)
                .findFirst()
                .orElseThrow(()->new RuntimeException("No Fifth element is present"));
        System.out.println(result);
    }
}
