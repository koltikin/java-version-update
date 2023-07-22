package com.cydeo.flatMap;

import java.util.List;
import java.util.stream.Stream;

public class EmployeeTest {
    public static void main(String[] args) {

        // print all emails
        System.out.println("********* print all the emails ****************");

        EmployeeDate.readAll()
                .map(Employee::getEmEmail)
                .forEach(System.out::println);

        // print all phone numbers
        System.out.println("********* print all the phone numbers ****************");

        EmployeeDate.readAll()
                .flatMap(employee -> employee.getEmPhoneNumbers().stream())
                .forEach(System.out::println);


        // print all phone numbers
        System.out.println("********* print all the phone numbers ****************");

        EmployeeDate.readAll()
                .map(Employee::getEmPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);




    }
}
