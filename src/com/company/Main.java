package com.company;

public class Main {


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate('+', 2, 2));
        System.out.println(calculator.calculate('*', 2, 3));
        System.out.println(calculator.calculate('/', 2, 3));
        System.out.println(calculator.calculate('^', 2, 3));
        System.out.println(calculator.calculate('#', 2, 3));
        System.out.println(calculator.calculate('!', 2, 3));

    }

}
