package com.tek.dsa_practice;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k=3;
        int currentSum = 0;
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum+= arr[i];
            maxSum = Math.max(maxSum, currentSum);
        }
        for(int i=k;i<arr.length;i++){
            currentSum+=(-arr[i-k]+arr[i]);
            maxSum=Math.max(maxSum,currentSum);
        }
        System.out.println("Maximum sum of a contiguous subarray is " + maxSum);
    }
}

