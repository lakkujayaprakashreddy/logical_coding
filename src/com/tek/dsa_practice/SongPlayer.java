package com.tek.dsa_practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SongPlayer {
    public static void main(String[] args) {
        int[] songs={1,2,3,4,5};
        playSongs(songs);
    }
    public static void playSongs(int[] songs){
        List<Integer> streamOfSongs= Arrays.stream(songs)
                .boxed()
                .collect(Collectors.toList());
        Collections.shuffle(streamOfSongs);
        streamOfSongs.forEach(System.out::println);
    }
}
