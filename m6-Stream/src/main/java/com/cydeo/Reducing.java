package com.cydeo;

import com.cydeo.task2.Dish;
import com.cydeo.task2.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Reducing {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Optional<Integer> sumOfNumbers = numbers.stream().reduce(Integer::sum);

//        adding the initial value to the sum
        Integer sumOfNumbers1 = numbers.stream().reduce(12, Integer::sum);
        System.out.println("sumOfNumbers = " + sumOfNumbers.get());
        System.out.println("sumOfNumbers1 = " + sumOfNumbers1);

        Optional<Integer> maxOfNumbers = numbers.stream().reduce(Integer::max);

        //   return the initial value if the max less than the initial value
        Integer maxOfNumbers1 = numbers.stream().reduce(12,Integer::max);
        System.out.println("maxOfNumbers = " + maxOfNumbers.get());
        System.out.println("maxOfNumbers1 = " + maxOfNumbers1);

        Optional<Integer> minOfNumbers = numbers.stream().reduce(Integer::min);

        //   return the initial value if the min grater than the initial value
        Integer minOfNumbers1 = numbers.stream().reduce(0,Integer::min);
        System.out.println("minOfNumbers = " + minOfNumbers.get());
        System.out.println("minOfNumbers1 = " + minOfNumbers1);

        double averageOfNumbers = ((numbers.stream().reduce(Integer::sum)).get()/(double)(numbers.size()));
        System.out.println("averageOfNumbers = " + averageOfNumbers);




        Optional<Integer> sumOfDishCalories = DishData.getAll().stream()
                .map(Dish::getCalories).reduce(Integer::sum);

        System.out.println("sumOfDishCalories = " + sumOfDishCalories.get());

        Optional<Integer> minOfDishCalories = DishData.getAll().stream()
                .map(Dish::getCalories).reduce(Integer::min);

        System.out.println("minOfDishCalories = " + minOfDishCalories.get());



    }
}
