package com.company.interfaces;

public class ConverterApplication {

    public static void main(String[] args) {

        ConverterIf convert1 = new ConverterIf();

        ConverterSwitch  userConvert = new ConverterSwitch();



        String userIf = convert1.convertMonth(6);
        System.out.println(userIf);

        String userSwitch =userConvert .convertDay(4);
        System.out.println(userSwitch);
    }


}