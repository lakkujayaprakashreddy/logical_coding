package com.tek.abc;

import java.util.Scanner;
import java.util.stream.Collectors;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter the String:");
        String input=scn.nextLine();
        String result=input.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.collectingAndThen(Collectors.toList(),list->{
                    java.util.Collections.reverse(list);
                    return list.stream()
                            .map(String::valueOf)
                            .collect(Collectors.joining());
                }));
        System.out.println(result);
    }
}
//SELECT SALARY FROM (SELECT SALARY,DENSE_RANK() OVER(ORDER BY SAL DESC) AS RNK FROM EMP) T WHERE RNK=5;