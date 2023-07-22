package com.cydeo;

import com.cydeo.task2.Dish;
import com.cydeo.task2.DishData;
import com.cydeo.task2.Type;

import java.util.*;
import java.util.stream.Collectors;

public class TerminalOperators {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5,6,8,9,1,2,23,45,6,8,48,40);


        //toCollection()Supplier : is used to creat a collection using Collector
       List<Integer> resultNum =  numbers.stream()
                .filter(x->x%3 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("resultNum = " + resultNum);


        Set<Integer> numbersHashSet = numbers.stream()
                .filter(x->x%3==0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println("numbersHashSet = " + numbersHashSet);

        //toList : create a new list
        List<Integer> numbersList = numbers.stream()
                .filter(x->x%3==0)
                .collect(Collectors.toList());
        System.out.println("numbersList = " + numbersList);

        //toSet : create a new set
        Set<Integer> numbersSet = numbers.stream()
                .filter(x->x%3==0)
                .collect(Collectors.toSet());
        System.out.println("numbersSet = " + numbersSet);

        //toMap : create a new Map
        Map<String,Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println("dishMap = " + dishMap);

        //summingINt : create sum of integer
        Integer sumOfCalories = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));

        System.out.println("sumOfCalories = " + sumOfCalories);

        //summingINt : create sum of integer
        int sumOfCalories1 = DishData.getAll().stream().mapToInt(Dish::getCalories).sum();

        System.out.println("sumOfCalories1 = " + sumOfCalories1);

        //averageInt : returns the average value
        double averageCalories = DishData.getAll().stream().collect(Collectors.averagingDouble(Dish::getCalories));
        System.out.println("averageCalories = " + averageCalories);

        //joining : Concatenate the elements and then return single element object
        List<String> courses = Arrays.asList("Java","JS","Python");
        String joinedCourses = courses.stream().collect(Collectors.joining(","));
        System.out.println("joinedCourses = " + joinedCourses);

        //joining : Concatenate the elements and then return single element object
        String joinedCourses1 = String.join(",", courses);
        System.out.println("joinedCourses = " + joinedCourses1);

        // partitioningBy(): is used to partitioning a stream of object

        Map<Boolean,List<Dish>> partitionedDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
     System.out.println("partitionedDish = " + partitionedDish);

     // groupingBy(): is used for objects by some property and storing results in a Map instance
     Map<Type,List<Dish>> groupedDish = DishData.getAll().stream()
             .collect(Collectors.groupingBy(Dish::getType));
     System.out.println("groupedDish = " + groupedDish);



    }
}
