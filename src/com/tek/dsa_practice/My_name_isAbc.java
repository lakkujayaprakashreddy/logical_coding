package com.tek.dsa_practice;
//My,name. is Abc
import java.util.Scanner;

public class My_name_isAbc {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter the String:");
        String input=scn.nextLine();
        System.out.println(giveResult(input));
    }
    public static String giveResult(String input){
        StringBuilder word=new StringBuilder();
        StringBuilder result=new StringBuilder();
        for(char ch:input.toCharArray()){
            if(Character.isLetter(ch)){
                word.append(ch);
            }else {
                result.append(word.reverse());
                result.append(ch);
                word.setLength(0);
            }
        }
        result.append(word.reverse());
        return result.toString();
    }

}
