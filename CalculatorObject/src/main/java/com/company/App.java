package com.company;

public class App {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("The calculation being performed is 1 + 1 = " + calc.add(1,1));

        System.out.println("Calculation being performed is 23 - 52 =  " + calc.subtract(23,52));

        System.out.println("Calculation to be performed in this method is 34 * 2 = " + calc.multiply(34,2));

        System.out.println("The result of this calculation of 12 / 3 = " + calc.divide(12,3));

        System.out.println("This is a calculation of 3.4 + 2.3 = " + calc.add(3.4,2.3));

        System.out.println("The calculation of this function should be 5.5 - 0.5 =  " + calc.subtract(5.5,0.5));

        System.out.println("This calculation is 6.7 * 4.4 = " + calc.multiply(6.7,4.4));

        System.out.println("The calculation here states 10.8 / 2.2 = " + calc.divide(10.8,2.2));

    }
}
