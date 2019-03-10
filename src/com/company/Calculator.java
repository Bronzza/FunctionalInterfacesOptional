package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Calculator {

    final String message = "Incorrect sybmol, enter: +, -, *, ^, #, !";
    final private Map<Character, BinaryOperator<Double>> operations = new HashMap<>() {
        {
            operations.put('+', (numb, numb2) -> numb + numb2);
            operations.put('-', (numb, numb2) -> numb - numb2);
            operations.put('*', (numb, numb2) -> numb * numb2);
            operations.put('/', (numb, numb2) -> numb / +numb2);
            operations.put('^', (numb, numb2) -> Math.pow(numb, numb2));
            operations.put('#', (numb, numb2) -> Math.pow(numb, 1 / numb2));
            operations.put('!', (numb, numb2) -> Math.pow(numb, numb2) / (numb + 117));
        }
    };

    public double calculate(char operation, double number1, double number2) {
        return Optional.ofNullable(operations.get(operation))
                .orElseThrow(() -> new IllegalArgumentException(message))
                .apply(number1, number2);
    }

}
