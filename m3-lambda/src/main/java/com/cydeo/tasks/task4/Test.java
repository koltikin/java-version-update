package com.cydeo.tasks.task4;

import com.cydeo.tasks.task3.Gender;
import com.cydeo.tasks.task3.Users;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {

        List<Users> users = new ArrayList<>();
        users.add(new Users("ziya", Gender.M,33));
        users.add(new Users("alim", Gender.M,20));
        users.add(new Users("yusuf", Gender.M,18));
        users.add(new Users("abdullah", Gender.M,40));

        System.out.println("----------------- Z -----------------------------");

        PrintAllElementE(users, urs-> urs.getName().toUpperCase().startsWith("Z"));

        System.out.println("----------------- A -----------------------------");

        PrintAllElementE(users, urs-> urs.getName().toUpperCase().startsWith("A"));

        System.out.println("----------------- all elements -----------------------------");

        PrintAllElementE(users, urs-> true);
    }

    private static void PrintAllElementE(List<Users> users, Predicate<Users> find) {
        for (Users user : users) {
            if (find.test(user)){
                System.out.println(user);
            }

        }
    }


}
