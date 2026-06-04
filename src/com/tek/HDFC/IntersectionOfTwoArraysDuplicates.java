package com.tek.HDFC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArraysDuplicates {
    public static void main(String[] args) {
        int[] arr1={1,2,2,1};
        int[] arr2={2,2};
        List<Integer> result=intersection(arr1,arr2);
        System.out.println(result);
    }
    public static List<Integer> intersection(int[] arr1,int[] arr2){
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> result=new ArrayList<>();
        for(int num:arr1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:arr2){
            if(map.getOrDefault(num,0)>0){
                result.add(num);
              map.put(num,map.get(num)-1);
            }
        }
        return result;
    }
}
