package com.tek.HDFC;
import java.util.*;
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr={100,4,200,1,3,2};
        int result=longestConsecutive(arr);
        System.out.println(result);
    }
    public static int longestConsecutive(int[] arr){
        int maxConsecutive=0;
        Set<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        for(int num:arr){
            if(!set.contains(num-1)){
                int currentNum=num;
                int count=1;
                while(set.contains(currentNum+1)){
                    count++;
                    currentNum++;
                    maxConsecutive=Math.max(maxConsecutive,count);
                }
            }
        }
        return maxConsecutive;
    }
}
