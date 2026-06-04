package com.tek.dsa_practice;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EvenRangePrint {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the start range:");
        int startRange=scn.nextInt();
        System.out.println("Enter the second range:");
        int lastRange=scn.nextInt();
        List<Integer> evenRange= printEvenNumbers(startRange,lastRange);
        System.out.println(evenRange);
    }
    public static List<Integer> printEvenNumbers(int startRange,int lastRange){
        return IntStream.range(startRange,lastRange)
                .filter(num->num%2==0)
                .boxed()
                .collect(Collectors.toList());
    }
}
