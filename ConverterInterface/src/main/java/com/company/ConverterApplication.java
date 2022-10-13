package com.company;

public class ConverterApplication {

    public static void main(String[] args) {

        Converter convert1 = new ConverterIf();

        Converter  userConvert = new ConverterSwitch();

        System.out.println("Create a string for the day of the week using " + convert1.convertMonth(5));
        System.out.println(convert1.convertDay(3));
    }


}