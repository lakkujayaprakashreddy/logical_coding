package com.tek.dsa.binary_search;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        System.out.println("Insert Position:"+searchInsert(nums,target));
    }
    public static int searchInsert(int[] arr,int target){
        int left=0;
        int right= arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }else if (arr[mid]<target){
                left=mid+1;
            }else {
                right=right-1;
            }
        }
        return left;
    }
}
