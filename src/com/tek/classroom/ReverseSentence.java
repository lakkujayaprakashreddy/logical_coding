package com.tek.classroom;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the String:");
        String input = scn.nextLine();
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }
        System.out.println("The reversed sentence is: " + result.toString());
    }
}
