package Revise;

import java.util.Arrays;

public class FirstLastPosition {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result=searchRange(nums,target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] searchRange(int[] arr,int target){
        int first=findFirst(arr,target);
        int last=findLast(arr,target);
        return new int[] {first, last};
    }
    public static int findFirst(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        int result=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                result=mid;
                right=mid-1;
            } else if (arr[mid]<target) {
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return result;
    }
    public static int findLast(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        int result=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            left=mid+1;
            if(arr[mid]==target){
                result=mid;
                left=mid+1;
            }else if (arr[mid]<target) {
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return result;
    }
}
