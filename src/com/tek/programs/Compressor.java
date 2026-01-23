package com.tek.programs;

import java.util.Scanner;

public class Compressor {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter the String to be compressed:");
        char[] input=scn.nextLine().toCharArray();
        StringBuffer result=new StringBuffer();
        int count=1;
        for(int i=1;i<input.length;i++){
            if(input[i-1]==input[i]){
                count++;
            }else{
                result.append(input[i-1]).append(count);
                count=1;
            }
        }
        result.append(input[input.length-1]).append(count);
        System.out.println("The Compressed String is: "+result.toString());
    }
}
