package com.tek.dsa_practice;

public class ProductOfArrayExceptItself {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] result=productExceptItself(arr);
        System.out.println(java.util.Arrays.toString(result));
    }
    public static int[] productExceptItself(int[] arr){
        int[] result=new int[arr.length];
        result[0]=1;
        for(int i=1;i<arr.length;i++){
            result[i]=result[i-1]*arr[i-1];
        }
        int suffix=1;
        for(int i=arr.length-1;i>=0;i--){
            result[i]*=suffix;
            suffix*=arr[i];
        }
        return result;
    }
}
