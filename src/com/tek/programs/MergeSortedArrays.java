package com.tek.programs;

public class MergeSortedArrays {
    public void merge(int[] arr1,int n1,int[] arr2,int n2){
       int i=n1-1;
       int j=n2-1;
       int resultSise=n1+n2-1;
       while(i>=0 && j>=0){
           if (arr1[i]>arr2[j]){
               arr1[resultSise--]=arr1[i--];
           }else {
               arr1[resultSise--]=arr2[j--];
           }
       }
        while (j>=0) {
            arr1[resultSise--]=arr2[j--];
       }
    }
}
