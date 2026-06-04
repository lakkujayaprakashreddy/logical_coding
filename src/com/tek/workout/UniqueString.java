package com.tek.workout;

import java.util.Scanner;

public class UniqueString {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter the String to be converted:");
        String input=scn.nextLine();
        if(isUnique(input)){
            System.out.println("The String is Unique");
        }else {
            System.out.println("The String is not Unique");
        }
    }
    public static boolean isUnique(String input){
        Long result=input.chars().mapToObj(c->(char)c).distinct().count();
        if(result==input.length()) {
            return true;
        }else{
            return false;
        }
    }
}
