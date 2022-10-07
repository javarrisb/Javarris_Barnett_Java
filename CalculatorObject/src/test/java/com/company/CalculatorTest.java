package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calc1 = new Calculator();

    @Test
    public void shouldAddTwoIntegersAndGiveSum() {


        int actualResult = calc1.add(1,1);
        int expectedResult = 2;

        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void shouldSubtractTwoIntegersAndGiveTheDifference() {

        int actualResult = calc1.subtract(23, 52);
        int expectedResult = -29;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldReturnTheProductOfTwoIntegersWhenTwoIntegersAreGiven() {

        int actualResult = calc1.multiply(34, 2);
        int expectedResult = 68;

        assertEquals(expectedResult,actualResult);
    }

    @Test

    public void shouldReturnQuotientOfTwoIntegersWhenTwoIntegersAreGiven() {

        int actualResult = calc1.divide(12,3);
        int expectedResult = 4;

        assertEquals(expectedResult, actualResult);

    }



    @Test
    public void shouldReturnSumOfTwoDoublesAddedTogether() {

        double actualResult = calc1.add(3.4d, 2.3d);
        double expectedResult = 5.7d;

        assertEquals(expectedResult, actualResult, 0.1);

    }

    @Test
    public void shouldSubtractTwoDoublesAndGiveTheDifference() {

        double actualResult = calc1.subtract(5.5, 0.5);
        double expectedResult = 5;

        assertEquals(expectedResult, actualResult, 0.5d);

    }

    @Test
    public void shouldMultiplyTwoDoublesAndGiveTheProductOfTheDoubles() {

        double actualResult = calc1.multiply(6.7, 4.4);
        double expectedResult = 29.48;

        assertEquals(expectedResult, actualResult, .5);
    }

    @Test
    public void shouldDivideTwoDoublesAndGiveTheQuotientOfTheDoubles() {

        double actualResult = calc1.divide(10.8, 2.2);
        double expectedResult = 4.9;

        assertEquals(expectedResult, actualResult, .1);
    }
}