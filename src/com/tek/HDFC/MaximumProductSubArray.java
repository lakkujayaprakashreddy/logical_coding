package com.tek.HDFC;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        int[] arr={2,3,-2,4};
        System.out.println(maxProduct(arr));
    }

    private static int maxProduct(int[] arr) {
        int min=arr[0];
        int max=arr[0];
        int result=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<0){
                int temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(arr[i],arr[i]*max);
            min=Math.min(arr[i],arr[i]*min);
            result=Math.max(result,max);
        }
        return result;
    }
}
