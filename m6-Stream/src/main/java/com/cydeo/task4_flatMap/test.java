package com.cydeo.task4_flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test {

        public static void main(String[] args) {
            List<Integer> numbers1 = Arrays.asList(1, 2, 3);
            List<Integer> numbers2 = Arrays.asList(3, 4);

            List<List<Integer>> pairs = getAllPairs(numbers1, numbers2);

            // Printing the pairs
            System.out.println(pairs);

        }

    public static List<List<Integer>> getAllPairs(List<Integer> numbers1, List<Integer> numbers2) {
        return numbers1.stream()
                .flatMap(num1 -> numbers2.stream().map(num2 -> Arrays.asList(num1, num2)))
                .collect(Collectors.toList());
    }

}
