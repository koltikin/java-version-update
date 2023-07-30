package com.cydeo.Java9;

import java.util.*;
import java.util.stream.Collectors;

public class FactoryMethodsDemo {
    public static void main(String[] args) {

//        Creating unmodifiable List before Java9
        List<String> courses = Collections.unmodifiableList(Arrays.asList("Java",
                "Spring","Agile"));
//        courses.add("TS");
        System.out.println(courses);

//        Creating unmodifiable List after Java9

        List<String> myCourses = List.of("Java","Spring","Agile");

//        Creating unmodifiable set after Java9

        Set<String> myProducts = Set.of("Milk","Bread","Butter");

//        Creating unmodifiable map after Java9

        Map<String,Integer> myCar = Map.of(
                "Honda",1,
                "BMW",2,
                "Mazda",5);
        System.out.println(myCar);

//        myCar.put("Toyota",3);



    }
}
