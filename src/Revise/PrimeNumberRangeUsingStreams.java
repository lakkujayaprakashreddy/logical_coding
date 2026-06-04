package Revise;

import java.util.stream.IntStream;

public class PrimeNumberRangeUsingStreams {
    public static void main(String[] args) {
        IntStream.rangeClosed(2,10).filter(n->IntStream.rangeClosed(2,(int)Math.sqrt(n)).noneMatch(i->n%i==0)).forEach(System.out::println);
    }
}
