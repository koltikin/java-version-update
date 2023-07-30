package com.cydeo.Java12;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class TeeingDemo {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1,"A",BigDecimal.valueOf(100)),
                new Employee(2,"B",BigDecimal.valueOf(200)),
                new Employee(3,"C",BigDecimal.valueOf(350)),
                new Employee(4,"D",BigDecimal.valueOf(950))
        );
        HashMap<String, Employee> result = employeeList.stream().collect(Collectors.teeing(
                Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                Collectors.minBy(Comparator.comparing(Employee::getSalary)),
                (e1,e2)->{
                    HashMap<String,Employee> myMap = new HashMap<>();
                    myMap.put("Max",e1.get());
                    myMap.put("Min",e2.get());
                    return myMap;
                }
        ));
        System.out.println("result = " + result);



    }

}


