package com.tek.classroom;

import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scn.nextLine();
        StringBuilder result=new StringBuilder();
        boolean[] boo=new boolean[256];
        for(char c:input.toCharArray()){
            if(!boo[c]){
                boo[c]=true;
                result.append(c);
            }
        }
        System.out.println("The string after removing duplicates is: "+result.toString());
    }
}
