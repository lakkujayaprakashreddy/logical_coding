package com.tek.abc;

import java.util.*;
import java.util.stream.Collectors;

public class MaxValue {
//    public static void main(String[] args) {
//        Scanner scn=new Scanner(System.in);
//        System.out.println("Please enter the String:");
//        String input=scn.nextLine();
//        char result=input.chars()
//                .mapToObj(c->(char)c)
//                .collect(Collectors.groupingBy(c->c,Collectors.counting()))
//                .entrySet()
//                .stream()
//                .max(Map.Entry.comparingByValue())
//                .map(Map.Entry::getKey)
//                .orElseThrow(()->new RuntimeException("No characters found"));
//        System.out.println(result);
//    }
public static void main(String[] args) {
    List<Integer> list= Arrays.asList(10, 25, 5, 40, 15);
    Optional<Integer> max=list.stream().max(Integer::compareTo);
    System.out.println(max);
}
}
