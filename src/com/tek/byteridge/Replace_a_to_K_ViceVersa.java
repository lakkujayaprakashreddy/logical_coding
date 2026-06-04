package com.tek.byteridge;

import java.util.Scanner;
import java.util.stream.Collectors;

public class Replace_a_to_K_ViceVersa {
    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Please enter the String to be reversed:");
            String input = scn.nextLine();
            String result=input.chars()
                    .mapToObj(c->{
                    if(c=='a') return 'k';
                    if(c=='A') return 'K';
                    return (char)c;
                    }).map(String::valueOf).collect(Collectors.joining());
            System.out.println(result);
    }
}
