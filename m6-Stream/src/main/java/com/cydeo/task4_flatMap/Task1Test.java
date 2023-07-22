package com.cydeo.task4_flatMap;

import java.util.Arrays;
import java.util.List;

public class Task1Test {
    public static void main(String[] args) {
        State state1 = new State();
        state1.addCity("istanbul");
        state1.addCity("izmir");

        State state2 = new State();
        state2.addCity("Ankara");
        state2.addCity("Adana");

        State state3 = new State();
        state3.addCity("Konya");
        state3.addCity("Kayseri");

        State state4 = new State();
        state4.addCity("Bursa");
        state4.addCity("Entep");

        List<State> myStates = Arrays.asList(state1,state2,state3,state4);
        myStates.stream()
                .map(State::getCities)
                .flatMap(List::stream)
                .forEach(System.out::println);




    }
}


/*
Suppose we have a State class that contains list of cities.
Create a list of States and print all the cities.
* */