package com.tek.workout;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CharCompressAlternative {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter the String to be converted:");
        String input=scn.nextLine();
        StringBuilder result=new StringBuilder();
        Map<Character,Long> freqMap=input.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));
        for(Map.Entry entry:freqMap.entrySet()){
            result.append(entry.getKey()).append(entry.getValue());
        }
        System.out.println(result);
    }
}
