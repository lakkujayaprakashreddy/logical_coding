package com.tek.dsa_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddFrequencyNumbers {
    public static void main(String[] args) {
        int[] arr={10, 20, 20, 10, 30, 40, 50, 50};
        List<Integer> result=Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()%2!=0)
                .map(entry->entry.getKey())
                .collect(Collectors.toList());
        System.out.println("Numbers with odd frequency: "+result);
        Arrays.stream(arr)
                .filter(c->String.valueOf(c).startsWith("1"))
                .boxed()
                .collect(Collectors.toList()).forEach(System.out::println);

    }
}
