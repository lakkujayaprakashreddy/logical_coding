package com.tek.dsa_practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingElements {
    public static void main(String[] args) {
        int[] arr={1,5,10};
        List<Integer> missing=findMissing(arr);
        System.out.println(missing);
    }
    public static List<Integer> findMissing(int[] arr){
        int min=Arrays.stream(arr).min().getAsInt();
        int max=Arrays.stream(arr).max().getAsInt();
        Set<Integer> set=Arrays.stream(arr).boxed().collect(Collectors.toSet());
        return IntStream.range(min,max)
                .filter(num->!set.contains(num))
                .boxed()
                .collect(Collectors.toList());
    }
}
