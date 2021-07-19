package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumDivisionAndDifference(double firstDiv, double secondDiv, double firstDif, double secondDif) {
        return division(firstDiv, secondDiv) + difference(firstDif, secondDif);
    }

    public static double sumAllMethodMathFunc(double first, double second) {
        return difference(first, second) + division(first, second) + multiply(first, second) + sum(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }
}

