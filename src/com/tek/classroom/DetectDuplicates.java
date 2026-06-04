package com.tek.classroom;

import java.util.HashSet;
import java.util.Set;

public class DetectDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 3};
        System.out.println(findDuplicates(arr));
    }
    public static Set<Integer> findDuplicates(int[] arr){
        Set<Integer> seen=new HashSet<>();
        Set<Integer> duplicates=new HashSet<>();
        for(int num:arr){
            if(!seen.add(num)) {
                duplicates.add(num);
            }
        }
        return duplicates;
    }
}
