package com.cybersoft.restfulapi.question3.service;

import com.cybersoft.restfulapi.question3.OperatorCalculation;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int calculate(int x, int y, OperatorCalculation operation) {
        return switch (operation) {
            case operation.ADD -> add(x, y);
            case operation.SUBTRACT -> sub(x, y);
            case operation.MULTIPLY -> multiply(x, y);
            case operation.DIVIDE -> divide(x, y);
        };
    }

    private int add(int x, int y) {
        return x + y;
    }

    private int sub(int x, int y) {
        return x - y;
    }

    private int multiply(int x, int y) {
        return x * y;
    }

    private int divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Divide by zero");
        }

        return x / y;
    }
}
