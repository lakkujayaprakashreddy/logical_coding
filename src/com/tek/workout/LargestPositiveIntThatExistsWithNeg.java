package com.tek.workout;

import java.util.HashSet;
import java.util.Set;

public class LargestPositiveIntThatExistsWithNeg {
    public static void main(String[] args) {
        int[] nums={-1,2,-3,3};
        System.out.println(findMaxK(nums));
    }
    public static int findMaxK(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int max=0;
        for(int num:nums){
            if(set.contains(num)&&set.contains(-num)){
                if(max<num) {
                    max = num;
                }
            }
        }
        if(max==0){
            return -1;
        }else {
            return max;
        }
    }
}
