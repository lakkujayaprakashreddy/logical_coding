package com.tek.dsa_practice;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseWithOutKeepingSplChar {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the string:");
        String input=scn.next();
        String result=reversewithoutSpecialChar(input);
        System.out.println(result);
    }
    public static String reversewithoutSpecialChar(String input){
        List<Character> result=input
                .chars()
                .mapToObj(c->(char)c)
                .filter(Character::isLetter)
                .collect(Collectors.toList());
        Collections.reverse(result);
        Iterator<Character> iterator=result.iterator();
        return input.chars()
                .mapToObj(c->(char)c)
                .map(c->Character.isLetter(c)?iterator.next():c)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
