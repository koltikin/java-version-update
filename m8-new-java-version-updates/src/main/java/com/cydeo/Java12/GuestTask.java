package com.cydeo.Java12;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GuestTask {


    public static void main(String[] args) {

        var guestList =
                List.of(
                                new Guest("Marco", true, 3),
                                new Guest("David", false, 2),
                                new Guest("Roger", true, 6));

       var result =  guestList.stream().collect(Collectors.teeing(Collectors.filtering(Guest::isParticipating, Collectors.mapping(Guest::getName, Collectors.toList())),
                                Collectors.filtering(Guest::isParticipating, Collectors.summingInt(Guest::getParticipantsNumber)), EventParticipation::new));

        System.out.println(result);


        var nameList = guestList.stream().filter(Guest::isParticipating)
                .map(Guest::getName)
                .toList();

        var numberOfGuest = guestList.stream().filter(Guest::isParticipating)
                .map(Guest::getParticipantsNumber)
                .mapToInt(Integer::intValue).sum();
        
        EventParticipation result1 = new EventParticipation(nameList,numberOfGuest);

        System.out.println("result1 = " + result1);



    }
}