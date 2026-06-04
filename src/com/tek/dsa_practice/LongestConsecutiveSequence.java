package com.tek.dsa_practice;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr={100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(arr));
    }
    public static int longestConsecutive(int[] arr){
        Set<Integer> set=new HashSet<>();
        for(int ele:arr){
            set.add(ele);
        }
        int longest=0;
        int currentNum=0;
        int count=0;
        for(int ele:set){
            if(!set.contains(ele-1)){
                currentNum=ele;
                count=1;
                while (set.contains(currentNum+1)) {
                    count++;
                    currentNum++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}
