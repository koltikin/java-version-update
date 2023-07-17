package com.cydeo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {

    List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300,Color.RED));
        inventory.add(new Apple(250,Color.GREEN));
        inventory.add(new Apple(150,Color.GREEN));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(250,Color.RED));

        Comparator<Apple> sortApple = Comparator.comparing((Apple apple)->apple.getWeight());
        Comparator<Apple> sortApple1 = Comparator.comparing(Apple::getWeight);

//        inventory.sort(sortApple1);
//        inventory.sort(Comparator.comparing(Apple::getWeight).reversed());
//        inventory.sort(Comparator.comparing(Apple::getColor));

        System.out.println(inventory);

        inventory.sort(Comparator.comparing(Apple::getWeight)
                .reversed());

        System.out.println(inventory);


    }
}
