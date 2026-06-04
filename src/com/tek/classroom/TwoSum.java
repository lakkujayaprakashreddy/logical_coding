package com.tek.classroom;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    public static int[] twoSum(int[] nums, int target){
        int compliment=0;
        Map<Integer,Integer> numMap= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            compliment=target-nums[i];
            if(numMap.containsKey(compliment)) {
                return new int[] {numMap.get(compliment),i};
            }else {
                numMap.put(nums[i],i);
            }
        }
        return new int[] {};
    }
}
