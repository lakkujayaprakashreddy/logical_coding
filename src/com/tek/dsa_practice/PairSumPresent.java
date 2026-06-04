package com.tek.dsa_practice;

import java.util.*;

public class PairSumPresent {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 8};
        List<List<Integer>> result=findPairs(arr);
        System.out.println(result);
    }

    private static List<List<Integer>> findPairs(int[] arr) {
        List<List<Integer>> result=new ArrayList<>();
        Set<Integer> ser=new HashSet<>();
        for(int num:arr){
            ser.add(num);
        }
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(ser.contains(arr[i]+arr[j])){
                    result.add(Arrays.asList(arr[i],arr[j]));
                }
            }
        }
        return result;
    }
}
