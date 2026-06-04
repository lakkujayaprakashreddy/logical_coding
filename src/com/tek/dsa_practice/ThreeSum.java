package com.tek.dsa_practice;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr={0,0,0};
        int target=0;
        Map<Integer,Integer> map=new HashMap();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        boolean[] boo=new boolean[arr.length];
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            if(!boo[i]){
                for(int j=0;j<arr.length;j++){
                    if(i!=j){
                        if(!boo[j]){
                            if(map.containsKey(-sumOfTwoNum(arr[i],arr[j]))){
                                boo[i]=true;
                                boo[j]=true;
                                boo[map.get(-sumOfTwoNum(arr[i],arr[j]))]=true;
                                result.add(Arrays.asList(arr[i],arr[j],-sumOfTwoNum(arr[i],arr[j])));
                            }
                        }
                    }else continue;
                }
            }else continue;
        }
        System.out.println(result);
    }
    public static int sumOfTwoNum(int a,int b){
        return a+b;
    }
}
