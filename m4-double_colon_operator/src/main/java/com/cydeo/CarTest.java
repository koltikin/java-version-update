package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {
    public static void main(String[] args) {

//        zero Argument Constructor

        Supplier<Car> makeCar = () -> new Car();
        Supplier<Car> makeCar1 = Car::new;
        System.out.println(makeCar.get().getModel());
        System.out.println(makeCar.get().getMake());

//        one argument constructor

        Function<Integer,Car> makeCar2 = Car::new;
        System.out.println(makeCar2.apply(2019));

//        two argument constructor

        BiFunction<String,Integer,Car> makeCar3 = Car::new;
        System.out.println(makeCar3.apply("tog", 2023));


    }
}
