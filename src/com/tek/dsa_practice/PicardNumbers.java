package com.tek.dsa_practice;

import java.util.Scanner;

public class PicardNumbers {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=scn.nextInt();
        int result=piCard(num);
        System.out.println("The "+num+"th Picard number is: "+result);
    }
    public static int piCard(int num){
        if(num<0) throw new RuntimeException("The number shounld be in positive");
        if(num==0 || num==1) return 1;
        int a=0;
        int b=1;
        int c=1;
        int d=0;
        for(int i=3;i<=num;i++){
            d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
        return d;
    }
}
