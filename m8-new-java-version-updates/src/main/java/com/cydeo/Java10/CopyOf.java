package com.cydeo.Java10;

import java.util.Arrays;
import java.util.List;

public class CopyOf {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,3,8,7,9,8);
        List<Integer> unmodifiableList1 = List.of(2,3,8,7,9,8);
        List<Integer> unmodifiableList2 = List.copyOf(numbers);


    }
}
