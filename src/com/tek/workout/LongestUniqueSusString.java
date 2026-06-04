package com.tek.workout;
import java.util.Scanner;
public class LongestUniqueSusString {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter the String to be converted:");
        String input=scn.nextLine();
        String longestUnique=" ";
        for (int i=0;i<input.length();i++){
            for(int j=i+1;j<input.length();j++){
                if( UniqueString.isUnique(input.substring(i,j))){
                    if(longestUnique.length()<input.substring(i,j).length()) longestUnique=input.substring(i,j);
                }
            }
        }
        System.out.println(longestUnique);
    }
}
