package com.cydeo.task4_flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task4Test {

    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);

        List<List<Integer>> pairs = numbers1.stream()
                .flatMap(num1->numbers2.stream().map(num2->Arrays.asList(num1,num2)))
                .collect(Collectors.toList());

        // Printing the pairs
        System.out.println(pairs);

    }
}
