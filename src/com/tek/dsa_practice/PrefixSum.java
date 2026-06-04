package com.tek.dsa_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.Arrays.stream;

public class PrefixSum {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};
        AtomicInteger sum=new AtomicInteger();
        int[] result = Arrays.stream(arr).map(sum::addAndGet).toArray();
        System.out.println(Arrays.toString(result));
    }

//    Alternative
//    -----------
//    int[] arr = {1,2,3,4,5};
//    int[] result = new int[arr.length];
//
//    result[0] = arr[0];
//
//for (int i = 1; i < arr.length; i++) {
//        result[i] = result[i-1] + arr[i];
//    }

//System.out.println(Arrays.toString(result));
}