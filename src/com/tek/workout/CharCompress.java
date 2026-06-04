package com.tek.workout;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCompress {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter the String to be converted:");
        String input=scn.nextLine();
        int count=1;
        Map<Character,Long> set=new HashMap<>();
        StringBuilder result=new StringBuilder();
        for(int i=1;i<input.length();i++){
           if(input.charAt(i)==input.charAt(i-1)){
               if(set.containsKey(input.charAt(i))){
                   set.put(input.charAt(i),set.get(input.charAt(i))+1);

               }else {
                     set.put(input.charAt(i), 2L);
               }
           }else{
               if(set.containsKey(input.charAt(i))){
                   set.put(input.charAt(i),set.get(input.charAt(i))+1);

               }else {
                   set.put(input.charAt(i), 1L);
               }
               result.append(input.charAt(i-1)).append(set.get(input.charAt(i-1)));
           }
        }
        result.append(input.charAt(input.length()-1)).append(set.get(input.charAt(input.length()-1)));
        System.out.println(result);
    }
}
