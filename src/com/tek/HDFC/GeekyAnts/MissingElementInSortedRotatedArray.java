package com.tek.GeekyAnts;

public class MissingElementInSortedRotatedArray {
    public static void main(String[] args) {
        int[] arr={5,6,7,1,2,4};
        int result=findMissing(arr);
        System.out.println(result);
    }
    public static int findMissing(int[] arr){
        int left=0;
        int right=arr.length;
        int pivot=findPivot(arr);
        int n=arr.length;
        while(left<=right){
            int mid=left+(right-left)/2;
            int realMid=(mid+pivot)%n;
            int expectedValue=arr[pivot]+mid;
            if(expectedValue==arr[realMid]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return arr[pivot]+left;
    }
    public static int findPivot(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]>arr[right]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left;
    }
}
