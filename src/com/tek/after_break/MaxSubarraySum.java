package com.tek.after_break;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k=3;
        int maxSum=maxSubArraySum(arr,k);
        System.out.println("Maximum sum of a contiguous subarray is " + maxSum);
    }
    public static int maxSubArraySum(int[] arr, int k){
        int currentSum=arr[0];
        for(int i=0;i<k;i++){
            currentSum=Math.max(arr[i],currentSum+arr[i]);
        }
        int maxSum=currentSum;
        for(int i=k;i<arr.length;i++){
            currentSum=currentSum+arr[i]-arr[i-k];
            maxSum=Math.max(currentSum,maxSum);
        }
        return maxSum;
    }
}
