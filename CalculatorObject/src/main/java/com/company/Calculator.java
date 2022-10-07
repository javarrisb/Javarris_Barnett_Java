package com.company;

public class Calculator {

    public int add(int a, int b) {
        System.out.println("The calculation being performed is 1 + 1 = 2 ");
        return a + b;
    }

    public int subtract(int a, int b) {
        System.out.println("Calculation being performed is 23 - 52 = -29 ");
        return a - b;
    }

    public int multiply(int a, int b) {
        System.out.println("Calculation to be performed in this method is 34 * 2 = 68");
        return a * b;
    }

    public int divide(int a, int b) {
        System.out.println("The result of this calculation of 12 / 3 is 4");
        return a / b;
    }


    public double add(double a,double b) {
        System.out.println("This is a calculation of 3.4 + 2.3 = 5.7 ");
        return a + b;
    }

    public double subtract(double a, double b) {
        System.out.println("The calculation of this function should be 5.5 - 0.5 ");
        return a - b;
    }

    public double multiply(double a, double b) {
        System.out.println("This calculation is 6.7 * 4.4 = 29.48");
        return a * b;
    }

    public double divide(double a, double b) {
        System.out.println("The calculation here states 10.8 / 2.2 = 4.9");
        return a / b;
    }
}
