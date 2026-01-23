package com.tek.random;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter the first number");
        int first=scn.nextInt();
        System.out.println("Please enter the second number");
        int second=scn.nextInt();
        System.out.println("Please enter the range number");
        int range=scn.nextInt();
        int third=0;
        while(first<=range){
            System.out.print(first+", ");
            third=first+second;
            first=second;
            second=third;
        }
    }
}
