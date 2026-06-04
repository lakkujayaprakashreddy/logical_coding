package com.tek.HDFC;

import java.util.Arrays;

public class BinarySearchinOrderArrWithUsingSort {
    public static void main(String[] args) {
        int[] arr={5, 2, 9, 1, 6, 3};
        int target=5;
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        int result=binarySearch(arr,target);
        if(result==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index:"+result);
        }

    }
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean swapped=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static int binarySearch(int[] arr,int target){
        int left=0;
        int right=arr.length;
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return -1;
    }
}
