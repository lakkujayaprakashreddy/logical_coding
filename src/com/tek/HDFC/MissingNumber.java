package com.tek.HDFC;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] arr){
        int left=0;
        int right=arr.length;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]!=mid+1){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left+1;
    }
}
