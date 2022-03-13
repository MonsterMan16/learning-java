package com.company;

public class AreaCalculator {
    private static final double PI = 3.14159265359;
    public static double area(double radius) {
        if(radius >= 0) {
            return (radius * radius * PI);
        }
        return -1.0;
    }

    public static double area(double x, double y) {
        if(x >= 0 && y >= 0) {
            return (x * y);
        }
        return -1.0;
    }
}
