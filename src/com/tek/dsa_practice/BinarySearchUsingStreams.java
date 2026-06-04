package com.tek.dsa_practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BinarySearchUsingStreams {
    public static void main(String[] args) {
        int[] arr={-1, 0, 3, 5, 7, 9, 12, 15, 17, 21, 24};
        int target=17;
        int result= IntStream.range(0,arr.length-1)
                        .filter(i->arr[i]==target)
                                .findFirst()
                                        .orElseThrow(()-> new RuntimeException("Target not found in the array"));
        System.out.println("Target found at index:"+result);
    }
}
