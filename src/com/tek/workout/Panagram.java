package com.tek.workout;

import java.util.Scanner;

public class Panagram {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter the String to be converted:");
        String input=scn.nextLine().toLowerCase();
        Long result=input.chars().mapToObj(c->(char)c).distinct().count();
        if(result==26) {
            System.out.println("The String is a Panagram");
        }else{
            System.out.println("The String is not a Panagram");
        }
    }
}
