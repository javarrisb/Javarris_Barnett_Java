package com.company;


public class ConverterIf implements Converter {

    public String convertMonth(int monthNumber) {

        if (monthNumber == 1) {
            return "January is month 1";
        } else if (monthNumber == 2) {
            return "February is month 2";
        } else if (monthNumber == 3) {
            return "March is month 3";
        } else if (monthNumber == 4) {
            return "April is month 4";
        } else if (monthNumber == 5) {
            return "May is month 5";
        } else if (monthNumber == 6) {
            return "June is month 6";
        } else if (monthNumber == 7) {
            return "July is month 7";
        } else if (monthNumber == 8) {
            return "August is month 8";
        } else if (monthNumber == 9) {
            return "September is month 9";
        } else if (monthNumber == 10) {
            return "October is month 10";
        } else if (monthNumber == 11) {
            return "November is month 11";
        } else if (monthNumber == 12) {
            return "December is month 12";
        } else {
            return "You have entered an invalid number";
        }
    }


    public String convertDay(int dayNumber) {
        if (dayNumber == 1) {
            return "Sunday is day  1";
        } else if (dayNumber == 2) {
            return "Monday is day  2";
        } else if (dayNumber == 3) {
            return "Tuesday is day  3";
        } else if (dayNumber == 4) {
            return "Wednesday is day 4";
        } else if (dayNumber == 5) {
            return "Thursday is day  5";
        } else if (dayNumber == 6) {
            return "Friday is day 6";
        } else if (dayNumber == 7) {
            return "Saturday is day 7";
        } else {
            return "You have entered an invalid number";
        }
    }

}
