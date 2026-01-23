package com.tek.programs;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={ 1,1,2,2,3,4,4,5};
        int k=removeDuplicates(arr);
        System.out.println("Length of array after removing duplicates:"+k);
        System.out.println("Array after removing duplicates:");
//        for(int ){
//
//        }
    }
    public static int removeDuplicates(int[] arr){
        int k=1;
        for(int i=1;i<arr.length;i++) {
            if(arr[i]!=arr[i-1]) {
                arr[k++]=arr[i];
            }
        }
        return k;
    }
}
