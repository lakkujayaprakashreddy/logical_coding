package com.tek.programs;

import java.util.Arrays;

public class RemoveElementfromArray {
    public static void main(String[] args) {
        int[] arr={3,2,2,3,4,5,3,6};
        int val=3;
        System.out.println(removeElement(arr,val));
    }

    public static int removeElement(int[] arr,int val){
        int resultIndex=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                arr[resultIndex++]=arr[i];
            }
        }
        return resultIndex;
    }
}
