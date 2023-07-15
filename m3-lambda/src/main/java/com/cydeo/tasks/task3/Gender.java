package com.cydeo.tasks.task3;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Gender {
    M("male"),F("female");
    private final String gender_name;

}
