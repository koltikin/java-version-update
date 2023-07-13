package com.cydeo.generic_tasks.Task2;

public class EvenDoublePredicate implements UnaryPredicate<Double> {

    @Override
    public boolean test(Double item) {
        return (item % 2 == 0);
    }
}
