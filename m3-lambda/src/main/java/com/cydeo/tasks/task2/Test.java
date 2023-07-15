package com.cydeo.tasks.task2;

import com.cydeo.tasks.task1.Color;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Orange orange1 = new Orange("GREEN", 90);
        Orange orange2 = new Orange("RED", 120);
        Orange orange3 = new Orange("GREEN", 100);
        Orange orange4 = new Orange("RED", 200);
        Orange orange5 = new Orange("GREEN", 130);
        Orange orange6 = new Orange("RED", 180);

        List<Orange> oranges = List.of(orange1,orange2,orange3,orange4,orange5,orange6);

        test(oranges,x->"An orange of "+x.getWeight()+"g");
        System.out.println("----------------------------------------");
        test(oranges,x->(x.getWeight()>=150)?"A light "+ x.getColor()+ "orange": "A heavy "+ x.getColor()+ " orange");
    }

    public static void test(List<Orange> oranges, OrangePredicate orangePredicate){
        for (Orange orange : oranges) {
            String outPut = orangePredicate.test(orange);
            System.out.println(outPut);
        }
    }
}
