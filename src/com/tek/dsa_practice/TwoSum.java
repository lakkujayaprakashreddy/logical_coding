package com.tek.dsa_practice;
import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        int[] arr=twoSum(nums,target);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] twoSum(int[] arr,int target){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int compliment=target-arr[i];
            if(map.containsKey(compliment)){
                return new int[] {map.get(compliment),i};
            }else{
                map.put(arr[i],i);
            }
        }
        return new int[] {};
    }
}
