package com.cydeo.Java11;

public class StringMethodDemo {
    public static void main(String[] args) {

        var str = "Yusuf\n Ziya\n Alim\n Adil";
        str.lines().forEach(System.out::println);



    }
}
