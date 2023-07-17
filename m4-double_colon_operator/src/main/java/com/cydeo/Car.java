package com.cydeo;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    private String make = "toyota";
    private int model = 2020;

    public Car(int model) {
        this.model = model;
    }
}
