package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,5,4,8,7,9,6,12);

        // empty() - isPresent()

        Optional<String> empty = Optional.empty();
        System.out.println("empty = " + empty);
        System.out.println(empty.isPresent());
        System.out.println(Optional.of(numbers).isPresent());
        numbers.stream().filter(x->x>100).forEach(System.out::println);

        // ifPresent

        System.out.println("**************** ifPresent *****************");

        Optional<Integer> bigNumber = numbers.stream().filter(x->x>10).findAny();
        System.out.println(bigNumber.isPresent());
        bigNumber.ifPresent(System.out::println);
        bigNumber.ifPresent(x->System.out.println(x+10));

        System.out.println("**************** get *****************");
        Optional<Integer> bigNumber1 = numbers.stream().filter(x->x>10).findAny();
        System.out.println(bigNumber1.get());


        System.out.println("**************** orElse *****************");
        Optional<Integer> bigNumber2 = numbers.stream().filter(x->x>100).findAny();
        System.out.println(bigNumber2.orElse(5));





    }



}
