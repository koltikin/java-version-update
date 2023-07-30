 package com.cydeo.Java10;

import java.util.Optional;

public class OrElseThrowDemo {
    public static void main(String[] args) {

        Optional<String> str = Optional.empty();
//        System.out.println(str.get());

        if(str.isPresent()){
            System.out.println(str.get());
        }else{
            System.out.println("no value");
        }

        System.out.println(str.orElseThrow(()->new RuntimeException()));

        if(str.isPresent()){
            System.out.println(str.get());
        }else{
            System.out.println("no value");
        }

    }
}
