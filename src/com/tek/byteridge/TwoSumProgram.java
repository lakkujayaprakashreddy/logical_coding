package com.tek.byteridge;

import java.util.*;

public class TwoSumProgram {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;
        int[] result=twoSum(arr,target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] twoSum(int[] arr,int target){
        Map map=new HashMap();
        for(int i=0;i<arr.length;i++){
            int compliment=target-arr[i];
            if(map.containsKey(compliment)){
                return new int[] {(int) map.get(compliment),i};
            }
            map.put(arr[i],i);
        }
        return new int[0];
    }
}
