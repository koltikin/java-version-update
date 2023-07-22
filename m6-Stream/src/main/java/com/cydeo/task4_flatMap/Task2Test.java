package com.cydeo.task4_flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Task2Test {
    public static <Array> void main(String[] args) {

        String words = "hello ziya how are you?";
        Arrays.stream(words.split(""))
                .distinct()
                .filter(c-> !Objects.equals(c, " "))
                .forEach(System.out::println);

        System.out.println("*********** convert to list **************");


       List<String> result = Arrays.stream(words.split(""))
                .distinct()
                .filter(c-> !Objects.equals(c, " "))
                .collect(Collectors.toList());

        System.out.println(result);



    }



}
