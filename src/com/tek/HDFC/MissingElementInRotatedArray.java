package com.tek.HDFC;

public class MissingElementInRotatedArray {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,1,2};
        System.out.println(findMissing(arr));
    }
    public static int findMissing(int[] arr){
        int left=0;
        int right=arr.length;
        while (left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]-mid==arr[0]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return arr[0]+left;
    }
}
