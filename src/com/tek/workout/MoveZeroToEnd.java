package com.tek.workout;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MoveZeroToEnd {
    public static int[] moveZero(int[] arr){

        return IntStream.concat(Arrays.stream(arr).filter(c -> c!=0),Arrays.stream(arr).filter(c -> c==0)).toArray();

    }

    public static  int[] move(int[] arr){

        int index=0;
        for (int i = 1; i < arr.length; i++) {

            if(arr[i]!=0){
                arr[++index]=arr[i];
            }

        }
        index++;
        while (index < arr.length) {
            arr[index++] = 0;
        }
        return arr;


    }

    public static void main(String[] args) {
        int[] arr={1,0,2,0,3,3,0};
        System.out.println(Arrays.toString(moveZero(arr)));
        System.out.println(Arrays.toString(move(arr)));

    }
}
