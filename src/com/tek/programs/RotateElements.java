package com.tek.programs;

import java.util.Arrays;

public class RotateElements {
    public void rotate(int[] nums, int k) {
        int length=nums.length;
        k=k%length;
        reverse(nums,0,length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,length-1);
    }
    public static void reverse(int[] nums,int left,int right){
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        RotateElements rotateElements=new RotateElements();
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        rotateElements.rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }
}
