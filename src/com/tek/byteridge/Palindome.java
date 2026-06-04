package com.tek.byteridge;

import java.util.Scanner;

public class Palindome {
    public static void main(String[] args) {

            Scanner scn = new Scanner(System.in);
            System.out.println("Please enter the String to be reversed:");
            String input = scn.nextLine();
            if(isPalindome(input)){
                System.out.println("The String is Palindome");
            }else {
                System.out.println("The String is not Palinsdome");
            }

    }
    public static boolean isPalindome(String input){
        String result=new StringBuilder(input).reverse().toString();
        return input.equals(result);
    }
}
