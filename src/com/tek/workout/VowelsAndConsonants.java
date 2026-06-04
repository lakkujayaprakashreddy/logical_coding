package com.tek.workout;

import java.util.Scanner;
import java.util.stream.Collectors;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter the String to be converted:");
        String input=scn.nextLine();
        String vowels=input.chars().mapToObj(c->(char)c).filter(c->"AEIOUaeiou".indexOf(c)!=-1).map(String::valueOf).collect(Collectors.joining());
        String consonants=input.chars().mapToObj(c->(char)c).filter(c->"AEIOUaeiou".indexOf(c)==-1).map(String::valueOf).collect(Collectors.joining());
        System.out.println("The Vowels in the String are: "+vowels);
        System.out.println("The Consonants in the String are: "+consonants);
    }
}
