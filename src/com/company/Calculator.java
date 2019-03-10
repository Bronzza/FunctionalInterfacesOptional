package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

public class Calculator {

    public double calculate(char operation, int number1, int number2){

        Map <Character, BinaryOperator <Double>> operations = new HashMap<>();
        operations.put('+',(numb,numb2) ->numb+numb2);
        operations.put('-',(numb,numb2) ->numb-numb2);
        operations.put('*',(numb,numb2) ->numb*numb2);
        operations.put('/',(numb,numb2) ->numb/+numb2);
        operations.put('^',(numb,numb2) ->Math.pow(numb,numb2));
        operations.put('#',(numb,numb2) ->Math.pow(numb, 1/numb2));
        operations.put('!',(numb,numb2) ->Math.pow(numb,numb2)/(numb+117));

        return  operations.get(operation).apply((double) number1, (double) number2);
    }
}
