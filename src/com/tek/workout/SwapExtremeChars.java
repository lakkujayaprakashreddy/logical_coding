package com.tek.workout;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SwapExtremeChars {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter the String to be converted:");
        String input=scn.nextLine();
        String result=Arrays.stream(input.split(" "))
                        .map(word->{
                            char firstChar=word.charAt(0);
                            String middle=word.substring(1,word.length()-1);
                            char lastChar=word.charAt(word.length()-1);
                            return lastChar+middle+firstChar;
                        }).collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
