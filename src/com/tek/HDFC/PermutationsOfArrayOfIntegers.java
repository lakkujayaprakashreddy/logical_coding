package com.tek.HDFC;

import java.util.Arrays;

public class PermutationsOfArrayOfIntegers {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        permute(nums,0);
    }
    public static void permute(int[] nums,int index){
        if(index==nums.length){
            System.out.println(Arrays.toString(nums));
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(nums,index,i);
            permute(nums,index+1);
            swap(nums,index,i);
        }
    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
