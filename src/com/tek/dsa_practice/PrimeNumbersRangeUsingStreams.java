package com.tek.dsa_practice;

import java.util.stream.IntStream;

public class PrimeNumbersRangeUsingStreams {
    public static void main(String[] args) {
        IntStream.range(1,100)
                .filter(n->IntStream.range(2,(int)Math.sqrt(n)).noneMatch(i->n%i==0)).forEach(System.out::println);
    }
}
