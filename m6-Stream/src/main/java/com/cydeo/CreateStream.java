package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {

        //        creating Stream from Array
        String[] courses = {"Java","Spring","Agile"};
        Stream<String> courseStream = Arrays.stream(courses);

        //        creating Stream from Collections
        List<String> courseList = Arrays.asList("Java","Spring","Agile");
        Stream<String> courseListStream = courseList.stream();

        List<Course> myCourses = Arrays.asList(
                new Course("Java",18),
                new Course("Python",19),
                new Course("C++",20),
                new Course("C#",21)
        );

        Stream<Course> myCoursesStream = myCourses.stream();

//        creating Stream
        Stream<Course> myCoursesStream1 = Stream.of(new Course("Java",18),
                new Course("Python",19), new Course("C++",20));




    }
}
