package com.cydeo.task3;

import com.cydeo.task2.Dish;
import com.cydeo.task2.Type;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Dish> menu = Arrays.asList(
                new Dish("pork",false,800, Type.MEAT),
                new Dish("beef",false,700,Type.MEAT),
                new Dish("chicken",false,400,Type.MEAT),
                new Dish("fries",true,530,Type.OTHER),
                new Dish("rice",true,350,Type.OTHER),
                new Dish("fruit",true,120,Type.OTHER),
                new Dish("pizza",true,550,Type.OTHER),
                new Dish("prawns",false,300,Type.FISH),
                new Dish("salmon",false,450,Type.FISH)
        );

        System.out.println("--------------all dishes name and it's length------------------");
                menu.stream()
                .map(d -> d.getName()+": "+d.getName().length())
                .forEach(System.out::println);


        System.out.println("------ all dishes name tha has less then 400 calories------------------");
                 menu.stream()
                .filter(dish -> dish.getCalories()<400)
                .forEach(dish -> System.out.println(dish.getName()));

        System.out.println("------ all dishes name tha has less then 400 calories in sorted------------------");
        menu.stream()
                .filter(dish -> dish.getCalories()<400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .forEach(dish -> System.out.println(dish.getName()));

        System.out.println("------ print three high caloric dish name ------------------");
        menu.stream()
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .limit(3)
                .forEach(dish -> System.out.println(dish.getName()));

    }
}
