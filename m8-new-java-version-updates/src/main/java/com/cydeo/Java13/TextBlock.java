package com.cydeo.Java13;

public class TextBlock {
    public static void main(String[] args) {
        var address = "ilimtepe mah, 3.Sk, No:15, D:21\nKocaeli/Istanbul";
        System.out.println(address);

        System.out.println("***************** *********************");

        var address1 = """
                ilimtepe mah, 3.Sk, No:15, D:21
                Kocaeli/Istanbul
                """;
        System.out.println(address);
        System.out.println(address1);

    }
}
