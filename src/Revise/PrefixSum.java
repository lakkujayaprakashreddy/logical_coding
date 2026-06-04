package Revise;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        AtomicInteger sum=new AtomicInteger();
        int[] result=Arrays.stream(arr).map(sum::addAndGet).toArray();
        System.out.println(Arrays.toString(result));
    }
}