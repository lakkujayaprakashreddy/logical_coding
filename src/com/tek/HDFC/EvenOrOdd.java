package com.tek.HDFC;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOrOdd {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        Map<String, List<Integer>> result= Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(c->c%2==0?"Even":"Odd"));
        System.out.println(result);
    }
}
