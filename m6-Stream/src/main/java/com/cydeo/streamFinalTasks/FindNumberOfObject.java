package com.cydeo.streamFinalTasks;

import com.cydeo.task2.Dish;
import com.cydeo.task2.DishData;

public class FindNumberOfObject {
    public static void main(String[] args) {

//        using reduce method
        System.out.println(DishData.getAll().stream().map(dish -> 1).reduce(Integer::sum).get());

    }
}

//How would you count the number of dishes object in a stream using the map and reduce methods?