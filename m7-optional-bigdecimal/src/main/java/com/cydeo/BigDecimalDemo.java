package com.cydeo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        double amount1 = 374.56;
        double amount2 = 374.26;
        System.out.println(amount1-amount2);

        BigDecimal b1 = new BigDecimal("374.56");
        BigDecimal b2 = new BigDecimal("374.26");
        BigDecimal b3 = BigDecimal.valueOf(374.84);
        BigDecimal b4 = BigDecimal.ONE;
        BigDecimal b5 = BigDecimal.TEN;

        System.out.println(b1.subtract(b2));
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);


        //Scaling
        System.out.println("************** Scaling ********************");
        BigDecimal myDecimal = BigDecimal.valueOf(24.2475);
        System.out.println(myDecimal.setScale(2, RoundingMode.CEILING));
        System.out.println(myDecimal.setScale(2, RoundingMode.FLOOR));
        System.out.println(myDecimal.setScale(2, RoundingMode.DOWN));
        System.out.println(myDecimal.setScale(2, RoundingMode.HALF_UP));
        System.out.println(myDecimal.setScale(2, RoundingMode.HALF_DOWN));

        //CompareTo()
        System.out.println("************** CompareTo() ********************");
        System.out.println(myDecimal.compareTo(BigDecimal.valueOf(24.247409990)));
        System.out.println(myDecimal.compareTo(BigDecimal.valueOf(24.247500000)));
        System.out.println(myDecimal.compareTo(BigDecimal.valueOf(24.2475000001)));


    }
}
