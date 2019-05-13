package com.kodilla.stream.beautifier;

public class SimpleCalculator {
    public void calculating(double a, double b, MathCalculations mathCalculations) {
        double result = mathCalculations.easyCalculations(a, b);
        System.out.println(result);
    }

    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.calculating(10, 20, (a, b) -> a + b);
        simpleCalculator.calculating(10, 20, (a, b) -> a - b);
        simpleCalculator.calculating(10, 20, (a, b) -> a * b);
        simpleCalculator.calculating(10, 20, (a, b) -> a / b);
    }
}
