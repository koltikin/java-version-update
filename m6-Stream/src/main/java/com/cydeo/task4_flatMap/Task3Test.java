package com.cydeo.task4_flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3Test {
    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(5,6,7,8,9,10,11,12);

        List<Integer> squareL1 = l1.stream()
                .map(i->i*i)
                .collect(Collectors.toList());

        System.out.println(squareL1);


        System.out.println("*********** task 2 ******************");

        List<Integer> numbers1 = Arrays.asList(1,2,3);
        List<Integer> numbers2 = Arrays.asList(3,4);

        List<List<Integer>> holeList = Arrays.asList(numbers1,numbers2);









        System.out.println(holeList);










    }

}

/*
1. Given a list of numbers how would you return a list of the square of each number? For example, given [1,2,3,4,5] you should return [1,4,9,16,25]
2. Given two lists of numbers, how would you return all pairs of numbers? For example, given a list [1,2,3] and a list [3,4] you should return [(1,3),(1,4),(2,3), (2,4),(3,3),(3,4)]
• List<Integer> numbers1 = Arrays.asList(1,2,3); • List<Integer> numbers2 = Arrays.asList(3,4); • List<int[]> pairs = ?????
*/
