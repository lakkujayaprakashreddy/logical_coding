package com.tek.GeekyAnts;
import java.util.*;
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr={100,4,200,1,3,2};
        Set<Integer> set=new HashSet();
        for(int num:arr){
            set.add(num);
        }
        int longestStreak=0;
        for(int num:arr){
            if(!set.contains(num-1)){
                int count=1;
                int currentNum=num;
                while(set.contains(currentNum+1)){
                    count++;
                    currentNum++;
                    longestStreak=Math.max(longestStreak,count);
                }
            }
        }
        System.out.println(longestStreak);
    }
}
