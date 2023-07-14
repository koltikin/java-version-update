package com.cydeo.tasks.task1;

public class AppleWeightPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()>200;
    }
}
