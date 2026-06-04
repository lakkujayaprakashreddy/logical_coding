package com.tek.dsa_practice;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enetr the number");
        int input=scn.nextInt();
        System.out.println(isArmstrong(input));
    }
    public static boolean isArmstrong(int num){
        int count=String.valueOf(num).length();
        int sum=0;
        int temp=num;
        while(num>0){
            int rem=num%10;
            sum+=Math.pow(rem,count);
            num/=10;
        }
        return sum==temp;
    }
}
