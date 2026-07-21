package com.tek.GeekyAnts;

public class ProductOfArryExceptItself {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
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
        System.out.println(java.util.Arrays.toString(result));
    }
}
