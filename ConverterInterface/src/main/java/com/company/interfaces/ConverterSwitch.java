package com.company.interfaces;

import java.util.Scanner;

public class ConverterSwitch implements Converter {

    private Scanner scan21;

    public void Input () { this.scan21 = new Scanner(System.in);
    }
    public String convertDay(int dayNumber) {
        System.out.println("Please enter a number between 1 and 7 to retrieve a day");
        int dayNum = Integer.parseInt( scan21.nextLine());

        String dayOfWeek = " ";
        switch (dayNum) {
            case 1:
                dayOfWeek = "Sunday is day 1";
                break;
            case 2:
                dayOfWeek = "Monday is day 2";
                break;
            case 3:
                dayOfWeek = "Tuesday is day 3";
                break;
            case 4:
                dayOfWeek = "Wednesday is day 4";
                break;
            case 5:
                dayOfWeek = "Thursday is day 5";
                break;
            case 6:
                dayOfWeek = "Friday is day 6";
                break;
            case 7:
                dayOfWeek = "Saturday is day 7";
                break;
            default: dayOfWeek = "You have entered an invalid day";
        }

        return dayOfWeek;
    }
}
