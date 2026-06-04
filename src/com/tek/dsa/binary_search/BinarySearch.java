package com.tek.dsa.binary_search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1, 3, 5, 7, 9, 11};
        int target=7;
        if(binarySearch(arr,target)!=-1){
            System.out.println("Index: "+binarySearch(arr,target));
        }else{
            System.out.println("Element not found in an array");
        }
    }
    public static int binarySearch(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
}
