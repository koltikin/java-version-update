package com.cydeo.generic_tasks;

public class OddPredicate implements UnaryPredicate<Integer>{
    @Override
    public boolean test(Integer item) {
        return (!(item % 2 == 0));
    }

}
