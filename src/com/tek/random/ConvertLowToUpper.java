package com.tek.random;

import java.util.Arrays;
import java.util.Scanner;

//convert Lower to uppercase and vice versa with out using default functions
public class ConvertLowToUpper {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter the String:");
        char[] input=scn.nextLine().toCharArray();
        for(int i=0;i<input.length;i++){
            if(input[i]>='a' && input[i]<='z'){
                input[i]=(char)(input[i]-32);
            }else if(input[i]>='A' && input[i]<='Z'){
                input[i]=(char)(input[i]+32);
            }else continue;

        }
        //converting char array into string
        String result=Arrays.toString(input).replaceAll(",","").replaceAll("\\[","").replaceAll("]","");
        System.out.println(result);
    }
}
