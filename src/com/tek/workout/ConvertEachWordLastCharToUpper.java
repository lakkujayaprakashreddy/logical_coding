package com.tek.workout;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ConvertEachWordLastCharToUpper {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter the String to be converted:");
        String input=scn.nextLine();
        String result= Arrays.stream(input.split(" "))
                .map(word->word.substring(0,word.length()-1).toLowerCase()+Character.toUpperCase(word.charAt(word.length()-1))).collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
