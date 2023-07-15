package com.cydeo.FunctionalInterface;

import com.cydeo.tasks.task1.Apple;
import com.cydeo.tasks.task1.Color;

import java.util.function.*;

public class Functions {
    public static void main(String[] args) {

        // ******************** Predicate ************************//
        System.out.println("// ******************** Predicate ************************//");

        Predicate<Integer> lessThen = i -> i<18;
        System.out.println(lessThen.test(25));

        Predicate<String> graterThen = str -> str.length()>10;
        System.out.println(graterThen.test("he"));

        // ******************** Consumer ************************//
        System.out.println("******************** Consumer ************************");

        Consumer<Apple> myApple = System.out::println;
        Consumer<Apple> myApple1 = apple -> System.out.println(apple);

        myApple.accept(new Apple(180, Color.RED));
        myApple1.accept(new Apple(210, Color.GREEN));

        // ******************** Bi Consumer ************************//
        System.out.println("******************** BiConsumer ************************");

        BiConsumer<Apple, Apple> myApples = (apple1,apple2)-> {
            int weight = apple1.getWeight()+apple2.getWeight();
            System.out.println("apple2 + apple2 = " + weight );
        };

        myApples.accept(new Apple(130,Color.RED), new Apple(210,Color.GREEN));

        // ******************** Function ************************//
        System.out.println("******************** Function ************************");

        Function<String,String> myFun = s->"hello "+ s;
        System.out.println(myFun.apply("Cydeo"));



        // ******************** BiFunction ************************//
        System.out.println("******************** BiFunction ************************");

        Apple myapple1 = new Apple(230,Color.GREEN);
        Apple myapple2 = new Apple(100,Color.RED);

        BiFunction<Apple,Apple,Integer> addApples = (x, y) -> x.getWeight()+y.getWeight();

        System.out.println(addApples.apply(myapple1, myapple2));


        // ******************** Supplier ************************//
        System.out.println("******************** Supplier ************************");
        Supplier<String> myHoney = ()->"ZUBEYDE";
        System.out.println(myHoney.get());


    }
}
