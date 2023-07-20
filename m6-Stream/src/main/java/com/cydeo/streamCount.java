package com.cydeo;

import com.cydeo.task2.Dish;
import com.cydeo.task2.DishData;

import java.util.Arrays;
import java.util.List;

public class streamCount {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12,5,9,15,78,4,6,3);

        System.out.println(numbers.stream().filter(i -> i % 2 == 0).count());

        System.out.println(DishData.getAll().size());
        System.out.println(DishData.getAll().stream().map(Dish::getCalories).count());


    }
}
