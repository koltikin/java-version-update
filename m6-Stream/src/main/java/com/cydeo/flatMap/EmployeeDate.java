package com.cydeo.flatMap;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeDate {
    
    public static Stream<Employee> readAll(){
        return Stream.of(
           new Employee(101,"ziya","ziya@cydeo.com", Arrays.asList("05352229285","05059579277")),
           new Employee(102,"alim","alim@cydeo.com", Arrays.asList("05352459258","05059572412")),
           new Employee(103,"abdulhabir","abduhabir@cydeo.com", Arrays.asList("05353489210","05369571785")),
           new Employee(104,"ferhat","parhat@cydeo.com", Arrays.asList("05354215520","05389543224")),
           new Employee(105,"yusuf","yusuf@cydeo.com", Arrays.asList("05353002508","05384051703")),
           new Employee(106,"osman","osman@cydeo.com", Arrays.asList("05352102353","05054366325"))
        );
    }
}
