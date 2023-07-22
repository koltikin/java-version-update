package com.cydeo.CreatingInfiniteStreams;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream.iterate(2, n->n+1) .limit(9)
                .forEach(System.out::println);

        Stream.generate(()->5) .limit(9)
                .forEach(System.out::println);
    }
}
