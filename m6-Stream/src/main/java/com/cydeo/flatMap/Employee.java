package com.cydeo.flatMap;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Employee {
    private int emId;
    private String emName;
    private  String emEmail;
    private List<String> emPhoneNumbers;
}
