package com.cydeo.Java9;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfinitiveGenerate {

    public static void main(String[] args) {

//        Stream.generate()

        System.out.println("********************* Stream.generate() ************************");
        Stream<Integer> streamOf5s = Stream.generate(() -> 5).limit(10);
        streamOf5s.forEach(System.out::println);

        Stream<String> myNameStream = Stream.generate(()->"ziya").limit(5);
        myNameStream.forEach(System.out::println);

        System.out.println("********************* Stream.iterate() ************************");

        Stream<Integer> myIntStream = Stream.iterate(2,n-> (int) Math.pow(n,2)).limit(7);
        myIntStream.forEach(System.out::println);

        Stream<int[]> myIntStream1 = Stream.iterate(new int[]{1,1},n-> new int[]{n[1],n[0]+n[1]}).limit(7);
        myIntStream1.forEach(n->System.out.println(n[0]+","+n[1]));


    }
}
