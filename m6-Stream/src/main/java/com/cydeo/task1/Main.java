package com.cydeo.task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> myWordList = Arrays.asList("ziya","alim zahiroglu","abdulhabir");

        Stream<Integer> intStream = myWordList.stream()
                .map(String::length);
//                .forEach(System.out::println);

        List<Integer> intList = intStream.collect(Collectors.toList());
        for (int i = 0; i < myWordList.size(); i++) {
            System.out.println(myWordList.get(i)+": "+ intList.get(i));

        }


    }
}
