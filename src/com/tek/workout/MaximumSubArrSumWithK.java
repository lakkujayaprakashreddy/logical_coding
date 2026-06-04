package com.tek.workout;

public class MaximumSubArrSumWithK {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};

        int maxSum=0;
        int k=3;
        int currentSum=0;
        for(int i=0;i<k;i++){
            currentSum+=arr[i];


        }
        if(currentSum<maxSum){
            maxSum=currentSum;
        }
        for(int i=k;i<arr.length;i++){

            currentSum=currentSum+arr[i]-arr[i-k];
            if(currentSum>maxSum){
                maxSum=currentSum;
            }

        }

        System.out.println(maxSum );

    }




}
