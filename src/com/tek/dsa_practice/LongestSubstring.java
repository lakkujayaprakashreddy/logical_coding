package com.tek.dsa_practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the string");
        String input=scn.nextLine();
        int left=0;
        int right=0;int maxLength=0;
        Set<Character> set=new HashSet<>();
        while(right<input.length()){
            if(!set.contains(input.charAt(right))){
                set.add(input.charAt(right));
                maxLength=Math.max(maxLength,right-left+1);
                right++;
            }else{
                set.remove(input.charAt(left));
                left++;
            }
        }
        System.out.println("Length of the longest substring without repeating characters is "+maxLength);
    }
}
