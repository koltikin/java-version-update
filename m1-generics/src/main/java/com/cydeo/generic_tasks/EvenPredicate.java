package com.cydeo.generic_tasks;

public class EvenPredicate implements UnaryPredicate<Integer>{
    @Override
    public boolean test(Integer item) {
        return (item % 2 == 0);
    }
}
