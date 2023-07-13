package com.cydeo.generic_tasks.Task4;

import java.util.List;

public class Test {

    public static void main(String[] args) {

        System.out.println("it is compile no problem");

    }
    public static void print(List<? extends Number> list) {
        for (Number n : list)
            System.out.print(n + " ");
            System.out.println();
    }

}


/*
    Will the following method compile? If not, why?
public static void print(List<? extends Number> list) {
        for (Number n : list)
        System.out.print(n + " "); System.out.println();
        }

        */
