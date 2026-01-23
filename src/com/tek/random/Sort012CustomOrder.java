package com.tek.random;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sort012CustomOrder {
    public static void main(String[] args) {
        int[] arr={1,1,0,2,1,0,2,2};
        int[] array = IntStream.concat(IntStream.concat(Arrays.stream(arr).filter(i -> i == 2),
                Arrays.stream(arr).filter(i -> i == 0)),
                Arrays.stream(arr).filter(i -> i == 1)).toArray();
        System.out.println(Arrays.toString(array));
    }
}
