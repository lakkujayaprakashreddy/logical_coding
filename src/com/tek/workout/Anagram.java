package com.tek.workout;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the first String to be converted:");
        String first = scn.nextLine();
        System.out.println("Please enter the second String to be converted:");
        String second = scn.nextLine();
        char[] firstArray=first.toCharArray();
        char[] secondArray=second.toCharArray();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        if(Arrays.equals(firstArray,secondArray)){
            System.out.println("The Strings are Anagrams");
        }else{
            System.out.println("The Strings are not Anagrams");
        }
    }
}
