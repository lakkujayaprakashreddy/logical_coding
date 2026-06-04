package Revise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter the String:");
        String input=scn.nextLine();
        System.out.println("The Longest Substring length:"+isLongestSubString(input));
    }
    public static int isLongestSubString(String input){
        int left=0;
        int right=0;
        int maxLength=0;
        Set<Character> set=new HashSet<>();
        while(right<input.length()){
            if(!set.contains(input.charAt(right))){
                set.add(input.charAt(right));
                maxLength=Math.max(maxLength,right-left+1);
                right++;
            }else{
                set.remove(input.charAt(right));
                left++;
            }
        }
        return maxLength;
    }
}
