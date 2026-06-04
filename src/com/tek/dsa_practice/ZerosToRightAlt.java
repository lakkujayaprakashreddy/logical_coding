package com.tek.dsa_practice;

public class ZerosToRightAlt {
    public static void main(String[] args) {
        int[] arr={0,1,0,3,12};
        boolean[] boo=new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                boo[i]=true;
            }
        }

    }
}
