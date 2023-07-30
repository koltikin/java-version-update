package com.cydeo.Java10;

import java.util.Arrays;

public class LocalVariableTypeDemo {

    public static void main(String[] args) {

        //Type Inference => type detect

        var str ="Cydeo";
        var number = 5;
        var price = 153.45;

        var numbers = Arrays.asList(4,5,6,7,8);

        var sum = 0;
        for (var each : numbers){
            sum = sum+each;
        }
        System.out.println(sum);







    }




}
