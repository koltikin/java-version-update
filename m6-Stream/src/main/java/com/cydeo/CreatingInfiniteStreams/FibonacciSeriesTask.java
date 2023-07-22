package com.cydeo.CreatingInfiniteStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class FibonacciSeriesTask {
    public static void main(String[] args) {
        Stream.iterate(new int[]{0,1},f->new int[]{f[1],f[0]+f[1]}) .limit(20)
              .forEach(t -> System.out.println("("+t[0]+","+t[1]+")"));

        List<List<Integer>> FibonacciSeriesList =  Stream.iterate(Arrays.asList(0, 1), f-> Arrays.asList(f.get(1), f.get(0) + f.get(1))
    ).limit(22).collect(Collectors.toList());

        System.out.println("FibonacciSeriesList = " + FibonacciSeriesList);

        FibonacciSeriesList.stream().flatMap(List::stream)
                .distinct().forEach(System.out::println);


        Stream.iterate(new int[]{0,1},f->new int[]{f[1],f[0]+f[1]}) .limit(20)
                .flatMapToInt(Arrays::stream).distinct()
                .forEach(System.out::println);

    }


}


//• You task is to generate the first 20 elements of the series of Fibonacci tuples using iterate method.
//Stream.iterate(new int[]{0,1},???) .limit(20)
//.forEach(t -> System.out.println("("+t[0]+","+t[1]+")"));
//Print the Fibonacci series in normal way. (Following of previous task)