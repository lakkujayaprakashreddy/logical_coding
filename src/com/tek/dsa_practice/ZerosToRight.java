package com.tek.dsa_practice;

public class ZerosToRight {
    public static void main(String[] args) {
        int[] arr={0,1,0,3,12};
        int k=0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] != 0) {
                arr[k++] = arr[i];
            }
        }
        while(k<arr.length){
            arr[k++]=0;
        }
        System.out.print("Array after moving zeros to the right: ");
        for(int num:arr) {
            System.out.print(num + " ");
        }
    }
}
