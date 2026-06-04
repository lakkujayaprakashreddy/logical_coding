package com.tek.dsa_practice;

import java.util.Scanner;

public class ArmstrongStreams {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enetr the number");
        int input=scn.nextInt();
        System.out.println(isArmstrong(input));
    }
    public static boolean isArmstrong(int num){
        String numStr=String.valueOf(num);
        int count=numStr.length();
        int sum=numStr.chars()
                .map(c->c-'0')
                .map(c->(int)Math.pow(c,count))
                .sum();
        return sum==num;
    }
}
