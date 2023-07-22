package com.cydeo;

import com.cydeo.task2.Dish;
import com.cydeo.task2.DishData;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindMatching {
    public static void main(String[] args) {

        System.out.println("********** allMatch ***************\n");
        boolean isHealthy = DishData.getAll().stream()
                .allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealthy);

        System.out.println("********** anyMatch ***************\n");
        boolean doesHaveVegetarian = DishData.getAll().stream()
                .anyMatch(Dish::isVegetarian);
        System.out.println(doesHaveVegetarian);

        System.out.println("********** noneMatch ***************\n");
        boolean isHealthy2 = DishData.getAll().stream()
                .noneMatch(d->d.getCalories()>=700);
        System.out.println(isHealthy2);


        System.out.println("********** findAny ***************\n");
        Optional<Dish> dish = DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findAny();
        System.out.println(dish);

        System.out.println("********** findFirst ***************\n");
        Optional<Dish> dish1 = DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findFirst();
        System.out.println(dish1);

        System.out.println("********** parallel ***************\n");
        System.out.println(IntStream.range(0,100).parallel().findAny());
        System.out.println(IntStream.range(0,100).parallel().findFirst());



        System.out.println("********** Min and Max ***** Min ********\n");

        Optional<Dish> minDish = DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println(minDish);



        System.out.println("********** Min and Max ***** Max ********\n");

        Optional<Dish> maxDish = DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(maxDish);


    }
}
