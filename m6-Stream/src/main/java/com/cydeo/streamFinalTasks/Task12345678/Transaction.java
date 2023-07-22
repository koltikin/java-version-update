package com.cydeo.streamFinalTasks.Task12345678;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Transaction {
    private Trader trader;
    private int year;
    private int value;
}
