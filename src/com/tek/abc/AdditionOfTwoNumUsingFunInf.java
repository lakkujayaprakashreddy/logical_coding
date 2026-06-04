package com.tek.abc;
@FunctionalInterface
interface AddTwoNum{
    int add(int a,int b);
}
public class AdditionOfTwoNumUsingFunInf {
    public static void main(String[] args) {
        AddTwoNum addition=(a,b)->a+b;
        int result=addition.add(10,20);
        System.out.println("Addition of two numbers is: "+result);
    }
}
