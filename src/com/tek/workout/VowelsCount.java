package com.tek.workout;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the String to be converted:");
        String input = scn.nextLine();
        long result=input.chars().mapToObj(c->(char)c).filter(c->"AEIOUaeiou".indexOf(c)!=1).count();
        System.out.println("The count of vowels in the String is :"+result);
    }
}
