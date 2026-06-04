package com.tek.HDFC;

public class MultipleMissingElements {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        findMissingElements(arr);
    }
    public static void findMissingElements(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[i]>=1 && arr[i]<=arr.length && arr[i]!=arr[correctIndex]){
                int temp=arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;
            }else{
                i++;
            }
        }
        System.out.println("Missing elements:");
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                System.out.println(i+1+"");
            }
        }
    }
}
