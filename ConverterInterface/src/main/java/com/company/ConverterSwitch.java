package com.company;


public class ConverterSwitch implements Converter {

    public String convertDay(int dayNumber) {
        switch (dayNumber) {
            case 1:
                return "Sunday is day 1";

            case 2:
                return "Monday is day 2";

            case 3:
                return "Tuesday is day 3";

            case 4:
                return "Wednesday is day 4";

            case 5:
                return "Thursday is day 5";

            case 6:
                return "Friday is day 6";

            case 7:
                return "Saturday is day 7";
            default:
                return "This number is not a valid input";
        }
    }

    public String convertMonth(int monthNumber) {
        switch (monthNumber) {
            case 1:
                return "January is month 1";

            case 2:
                return "February is month  2";

            case 3:
                return "March is month 3";

            case 4:
                return "April is month 4";

            case 5:
                return "May is month 5";

            case 6:
                return "June is month 6";

            case 7:
                return "July is month 7";
            case 8:
                return "August is month 8";
            case 9:
                return "September is month 9";
            case 10:
                return "October is month 10";
            case 11:
                return "November is month 11";
            case 12:
                return "December is month 12";
            default:
                return "This number is not a valid input";
        }
    }
}
