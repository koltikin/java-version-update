package com.cydeo;

import java.util.Arrays;
import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(8,5,9,8,7,-12,45,7,12);
        l1.forEach(System.out::println); // we can use forEach as one of the terminal operations

        // using Stream
        System.out.println("-------------using Stream-----filter------------");
        l1.stream()
                .filter(i ->i%2==0)
                .forEachOrdered(System.out::println);

        System.out.println("-------------using Stream-----distinct------------");
        l1.stream()
                .filter(i->i%2==0)
                .distinct()
                .forEachOrdered(System.out::println);


        System.out.println("-------------using Stream-----limit------------");
        l1.stream()
                .filter(i->i%2==0)
                .distinct()            // unique element
                .limit(2)
                .forEach(System.out::println);


        System.out.println("-------------using Stream-----skip------------");

        l1.stream()
                .filter(i->i%2==0)
                .distinct()            // unique element
                .limit(2)      // giving the size of the stream
                .skip(1)            // skipping the elements from the first element
                .forEach(System.out::println);

    }



}
