package com.tek.byteridge;

public class Example {
    public static void main(String[] args) {
        int num=10;
        boolean result=isEven(num);
        if(result){
            System.out.println("The given num is Even");
        }else{
            System.out.println("The given num is not Even");
        }
    }
    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }
}
