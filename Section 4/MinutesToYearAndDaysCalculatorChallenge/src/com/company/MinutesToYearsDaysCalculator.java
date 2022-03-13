package com.company;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if(minutes >= 0) {
            long days = ((minutes/60)/24)%365, years = (minutes/60)/24/365;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
