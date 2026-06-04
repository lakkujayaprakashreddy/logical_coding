package com.tek.GeekyAnts;

public class MaxProductSubarray {
    public static void main(String[] args) {
        int[] arr={2, 3, -2, 4};
        int min=arr[0];
        int max=arr[0];
        int result=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<0){
                int temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(arr[i],max);
            min=Math.min(arr[i],min);
            result=Math.max(result,max);
        }
        System.out.println(result);
    }
}
