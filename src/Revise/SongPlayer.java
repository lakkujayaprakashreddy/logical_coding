package Revise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SongPlayer {
    public static void main(String[] args) {
        int[] songs={1,2,3,4,5};
        List<Integer> collect = Arrays.stream(songs)
                .boxed()
                .collect(Collectors.toList());
        Collections.shuffle(collect);
        System.out.println(collect);
    }
}
