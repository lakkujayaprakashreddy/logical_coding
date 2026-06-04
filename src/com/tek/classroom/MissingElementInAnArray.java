package com.tek.classroom;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingElementInAnArray {
    public static void main(String[] args) {
        int[] arr={5,10,7};
        findAllMissing(arr);
    }
    public static void findAllMissing(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            int current=arr[i];
            int next=arr[i+1];
            for(int j=current+1;j<next;j++){
                System.out.println(j);
            }
        }
    }
}
