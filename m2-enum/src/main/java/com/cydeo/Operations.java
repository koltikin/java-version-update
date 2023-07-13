package com.cydeo;

public enum Operations {
    ADD('+'), SUBTRACTION('-') ,MULTIPLICATION('*'), DIVISION('/');

    private char operationSymbol;

    Operations(char chr) {
        this.operationSymbol = chr;
    }

    public char getOperationSymbol() {
        return operationSymbol;
    }
}