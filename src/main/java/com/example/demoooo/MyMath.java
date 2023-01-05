package com.example.demoooo;

public class MyMath {
    public static double divide(int number1, int number2) {
        if (number2 == 0)
            throw  new ArithmeticException("Деление на ноль");
        return number1 / number2;
    }
}
