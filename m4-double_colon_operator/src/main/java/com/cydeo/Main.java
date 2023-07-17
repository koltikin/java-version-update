package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {

        Calculate sum = (x,y) -> System.out.println(x+y);
        Calculate sum1 = (x,y)->Calculator.findSum(x,y);
        Calculate sum2 = Calculator::findSum;

        sum.calculate(8,9);
        sum1.calculate(8,9);
        sum2.calculate(8,9);



        Calculate subtract = (x,y)-> System.out.println(x-y);
        Calculate subtract1 = (x,y)->Calculator.findSubtraction(x,y);
        Calculate subtract2 = Calculator::findSubtraction;

        Calculate multiply = (x,y)-> System.out.println(x*y);

        // if the method none static we have to create new object
        Calculate multiply1 = (x,y)->new Calculator().findMultiplication(x,y);
        Calculate multiply2 =new Calculator()::findMultiplication;

        multiply.calculate(7,6);
        multiply1.calculate(7,6);
        multiply2.calculate(7,6);


        Calculate division = (x,y) ->System.out.println(x/y);
        Calculate division1 = (x,y) ->Calculator.findDivision(x,y);
        Calculate division2 = Calculator::findDivision;


        BiFunction<String,Integer,String> func1 = (str,i)->str.substring(i);
        BiFunction<String,Integer,String> func2 = String::substring;

        System.out.println(func1.apply("hello ziya", ("hello ziya".length())-1));
        System.out.println(func2.apply("hello ziya", 6));

        Function<Integer,Double> b = new MyClass()::method;

        BiFunction<MyClass,Integer,Double> b1 = MyClass::method;

        System.out.println(b.apply(8));
        System.out.println(b1.apply(new MyClass(), 8));


    }




}
