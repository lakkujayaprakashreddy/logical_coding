package com.tek.abc;
import java.util.*;
import java.util.stream.Collectors;

public class FreqCountExceptSpace {
    public static void main(String[] args) {
        String input="Bushra sultana";
        Map<Character,Long> result=input.chars()
                .mapToObj(c->(char)c)
                .filter(Character::isLetter)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(result);

    }
}
