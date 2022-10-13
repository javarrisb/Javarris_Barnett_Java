package com.company;

public class ConverterApplication {

    public static void main(String[] args) {

        Converter convert1 = new ConverterIf();

        Converter  userConvert = new ConverterSwitch();

        System.out.println( convert1.convertMonth(5));

        System.out.println(convert1.convertDay(3));

        System.out.println(userConvert.convertMonth(8));

        System.out.println(userConvert.convertDay(1));
    }


}