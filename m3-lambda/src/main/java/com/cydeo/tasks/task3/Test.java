package com.cydeo.tasks.task3;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Users> users = new ArrayList<>();

        users.add(new Users("ziya",Gender.M,33));
        users.add(new Users("adil",Gender.M,22));
        users.add(new Users("nurbiye",Gender.F,23));
        users.add(new Users("asiye",Gender.F,20));
        users.add(new Users("merdan",Gender.M,19));
        users.add(new Users("alim",Gender.M,24));

        filterUsersToSendMessage(users, user -> {
            if (user.getGender() == Gender.M){
                int age = user.getAge();
                return age > 18 && age < 25;
            }
            return false;
        });


    }

    public static void filterUsersToSendMessage(List<Users> users,FilterUser filter){
        for (Users user : users) {
            if(filter.filter(user)){
                String gender = user.getGender().getGender_name();
                System.out.println("the message sent to  user " + user.getName() + " who is "
                        + gender + " and " + user.getAge() + " years old");
            }

        }
    }
}


/*
Suppose that you are creating a social networking application. You want to
create a feature that enables an administrator to perform any kind of action,
such as sending a message, on members of the social networking application
that satisfy certain criteria.

Criteria : Send message to Male Members whose age is between 18 and 25

*/
