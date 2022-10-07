package com.company.interfaces;

import java.util.Scanner;

public class ConverterIf implements Converter {

        private Scanner scan1;

        public void  Output () { this.scan1 = new Scanner(System.in);
        }

        public String convertMonth(int monthNumber) {
            System.out.println("Please enter a number between 1 and 12 to retrieve a month");
            int monthOfYear = Integer.parseInt( scan1.nextLine());

            String month = "";


            if (monthOfYear == 1) {
                month = "January is month 1";
            } else if (monthOfYear == 2) {
                month = "February is month 2";
            } else if (monthOfYear == 3) {
                month = "March is month 3";
            } else if (monthOfYear == 4) {
                month = "April is month 4";
            } else if (monthOfYear == 5) {
                month = "May is month 5";
            } else if (monthOfYear == 6) {
                month = "June is month 6";
            } else if (monthOfYear == 7) {
                month = "July is month 7";
            } else if (monthOfYear == 8) {
                month = "August is month 8";
            } else if (monthOfYear == 9) {
                month = "September is month 9";
            } else if (monthOfYear == 10) {
                month = "October is month 10";
            } else if (monthOfYear == 11) {
                month = "November is month 11";
            } else if (monthOfYear == 12) {
                month = "December is month 12";
            } else {
                System.out.println("You have entered an invalid number");
            }
            return month;
    }
}
