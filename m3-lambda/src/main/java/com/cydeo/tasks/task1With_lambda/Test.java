package com.cydeo.tasks.task1With_lambda;

import com.cydeo.tasks.task1.Apple;
import com.cydeo.tasks.task1.ApplePredicate;
import com.cydeo.tasks.task1.AppleWeightPredicate;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Apple1> apple_List = new ArrayList<Apple1>();
        apple_List.add(new Apple1(200, Color1.RED));
        apple_List.add(new Apple1(150, Color1.GREEN));
        apple_List.add(new Apple1(250, Color1.RED));
        apple_List.add(new Apple1(300, Color1.RED));
        apple_List.add(new Apple1(100, Color1.GREEN));


        ApplePredicate1 greenPredicate = (Apple1 apple)->apple.getColor() == Color1.GREEN;
        ApplePredicate1 weightPredicate = (Apple1 apple)->apple.getWeight()>200;

        List<Apple1> heavyApple = filterApple(apple_List, weightPredicate);
        System.out.println("weight apple = " + heavyApple);
    }

    private static List<Apple1> filterApple(List<Apple1> inventory, ApplePredicate1 applePredicate){
        List<Apple1> result = new ArrayList<>();
        for (Apple1 apple : inventory) {
            if(applePredicate.test(apple)) {
                result.add(apple);
            }
        }

        return result;

    }
}
