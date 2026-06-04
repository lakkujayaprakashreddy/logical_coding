package com.tek.GeekyAnts;

public class MinSubArrayLength {
    public static void main(String[] args) {
        int[] arr={2,3,1,2,4,3};
        int target=7;
        System.out.println(minSubArrayLen(arr,target));
    }
    public static int minSubArrayLen(int[] arr,int target){
        int left=0;
        int right;
        int sum=0;
        int minLength=Integer.MAX_VALUE;
        for(right=0;right<arr.length;right++){
            sum+=arr[right];
            while(sum>=target){
                sum-=arr[left];
                minLength=Math.min(minLength,right-left+1);
                left++;
            }
        }
        return minLength;
    }
}
