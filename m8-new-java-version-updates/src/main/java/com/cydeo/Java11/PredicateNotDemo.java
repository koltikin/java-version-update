package com.cydeo.Java11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateNotDemo {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(12,3,45,6,78,95,2,4,51);

        Predicate<Integer> even = x->x%2 == 0;
        Predicate<Integer> odd = x->x%2 != 0;

        List<Integer> evenNumber = myList.stream()
                .filter(Predicate.not(odd))
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("evenNumber = " + evenNumber);

    }
}
