package Revise;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int first=scn.nextInt();
        System.out.println("Please enter the second number:");
        int second=scn.nextInt();
        System.out.println("Please enter the range number:");
        int range=scn.nextInt();
        while(first<range){
            System.out.println(first);
            int result=first+second;
            first=second;
            second=result;
        }
    }
}
