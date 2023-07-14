package com.cydeo.tasks.task1;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300,Color.RED));
        inventory.add(new Apple(250,Color.GREEN));
        inventory.add(new Apple(150,Color.GREEN));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(250,Color.RED));

        List<Apple> greenApple = filterApple(inventory,new AppleGreenColorPredicate());
        System.out.println("greenApple = " + greenApple);

        List<Apple> heavyApple = filterApple(inventory,new AppleWeightPredicate());
        System.out.println("heavyApple = " + heavyApple);
    }

    private static List<Apple> filterApple(List<Apple> inventory, ApplePredicate applePredicate){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if(applePredicate.test(apple)) {
                result.add(apple);
            }
            }

        return result;

        }
    }

