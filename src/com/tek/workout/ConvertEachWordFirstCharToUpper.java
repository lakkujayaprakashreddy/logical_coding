package com.tek.workout;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ConvertEachWordFirstCharToUpper {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter the String to be converted:");
        String input=scn.nextLine();
        String result=Arrays.stream(input.split(" "))
                .map(word->Character.toUpperCase(word.charAt(0))+word.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
