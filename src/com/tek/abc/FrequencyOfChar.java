package com.tek.abc;
import java.util.*;
import java.util.stream.Collectors;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String input="Bushra";
        Map<Character, Long> result=input.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(result);
    }
}
