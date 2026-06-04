package com.tek.dsa_practice;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=scn.nextInt();
        getFibonacci(num);
    }
    public static void getFibonacci(int num){
        int a=0;
        int b=1;
        int sum=0;
        while (num > 0) {
            sum=a+b;
            System.out.println(a);
            a=b;
            b=sum;
            num--;
        }
    }
}