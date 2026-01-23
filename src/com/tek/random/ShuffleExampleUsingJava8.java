package com.tek.random;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ShuffleExampleUsingJava8 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2, 4, 36, 56, 120);
        IntStream.range(0,list.size())
                .forEach(i->
                        IntStream.range(i+1,list.size())
                                .forEach(j->
                                        IntStream.range(j+1, list.size())
                                                .forEach(k->
                                                                System.out.println(Arrays.asList(list.get(i)+","+list.get(j)+","+list.get(k)))
                                                        )
                                        )
                        );


    }
}
