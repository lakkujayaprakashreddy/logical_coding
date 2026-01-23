package com.tek.random;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ShuffleExample {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2, 4, 36, 56, 120);
        Collections.shuffle(list);
        List<Integer> result=list.subList(0,3);
        System.out.println(result);
    }
}
