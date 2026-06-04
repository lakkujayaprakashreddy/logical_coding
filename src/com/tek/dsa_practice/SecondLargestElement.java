package com.tek.dsa_practice;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr={3,1,4,2,5};
        int result=Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(()-> new RuntimeException("No second largest element found"));
        System.out.println("The second largest element is: "+result);
    }
}
