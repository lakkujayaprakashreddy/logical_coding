package com.tek.GeekyAnts;

public class SEcondLargestEleWithoutUsingSorting {
    public static void main(String[] args) {
        int[] arr={10,20,5,8,15};
        int firstlargest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>firstlargest){
                secondLargest=firstlargest;
                firstlargest=arr[i];
            }else if (arr[i]>secondLargest && arr[i]!=firstlargest){
                secondLargest=arr[i];
            }
        }
        System.out.println("Second largest element is "+secondLargest);
    }
}
