package com.tek.workout;

import java.util.Arrays;
import java.util.Scanner;

public class CharsInWord {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter the String to be converted:");
        String input=scn.nextLine();
        Arrays.stream(input.split(" "))
                .map(word-> word+"-"+word.length()).forEach(System.out::println);

    }
}
