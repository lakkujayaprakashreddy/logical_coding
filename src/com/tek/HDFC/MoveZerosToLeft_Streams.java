package com.tek.HDFC;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MoveZerosToLeft_Streams {
    public static void main(String[] args) {
        int[] arr={0,1,0,3,12};
        int[] result= IntStream.concat(
                Arrays.stream(arr).filter(i->i==0),
                Arrays.stream(arr).filter(i->i!=0)
        ).toArray();
        System.out.println(Arrays.toString(result));
    }
}
