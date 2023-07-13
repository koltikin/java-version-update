package com.cydeo.generic_tasks.Task2;

public class EvenPredicate implements UnaryPredicate<Integer>{
    @Override
    public boolean test(Integer item) {
        return (item % 2 == 0);
    }
}
