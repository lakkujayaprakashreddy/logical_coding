package com.tek.dsa_practice;

import java.util.Arrays;

public class HighestPeakRecord {
    public static void main(String[] args) {
        int[] peakRecord = {2, 3, 1, 15, 9, 35, 65, 2, 7, 5};
        int max=Arrays.stream(peakRecord).max().orElseThrow(()-> new RuntimeException("Array is empty"));
        System.out.println("The highest peak record is: " + max);
    }
}
