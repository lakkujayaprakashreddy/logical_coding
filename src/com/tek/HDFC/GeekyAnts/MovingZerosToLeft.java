package com.tek.GeekyAnts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MovingZerosToLeft {
    public static void main(String[] args) {
        int[] arr={0,1,0,3,12};
        int[] result= IntStream.concat(Arrays.stream(arr).filter(c->c==0),Arrays.stream(arr).filter(c->c!=0)).toArray();
        System.out.println("Result: "+ Arrays.toString(result));
    }
}
