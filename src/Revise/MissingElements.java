package Revise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingElements {
    public static void main(String[] args) {
        int[] arr={1,5,10};
        int min= Arrays.stream(arr).min().getAsInt();
        int max=Arrays.stream(arr).max().getAsInt();
        Set<Integer> set=Arrays.stream(arr).boxed().collect(Collectors.toSet());
        List<Integer> missingElements= IntStream.rangeClosed(min,max)
                .boxed()
                .filter(c->!set.contains(c))
                .collect(Collectors.toList());
        System.out.println(missingElements);
    }
}
