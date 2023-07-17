package com.cydeo;

import java.util.function.Consumer;

public enum Operations {
    ADD('+'), SUBTRACTION('-') ,MULTIPLICATION('*'), DIVISION('/');

    private final char operationSymbol;


    Operations(char chr) {
        this.operationSymbol = chr;
    }

    public char getOperationSymbol() {
        return operationSymbol;
    }
}
