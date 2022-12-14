package com.bridgelabz.linecomparision;

public class UsingOopsMethod {
public static  double line1,line2;
    public static  void calSqrt() {
        double x1 = 13, x2 =25 , y1 = 2, y2 = 6;
         line1 = Math.sqrt((x2 - x1) + (y2 - y1));
        System.out.println(line1);
         line2 = Math.sqrt((x2 - x1) - (y2 - y1));
        System.out.println(line2);
    }

    public static void checkEqual() {
        if (line1 == line2) {
            System.out.println("Two line are equal");
        } else {
            System.out.println("Two line are not equal");
        }
    }

    public static void compareLines() {
        if (line1 >line2) {
            System.out.println("Line1 is the maximum");
        } else {
            System.out.println("Line2 is the maximum");
        }
    }

    public static void main(String[] args) {
        calSqrt();
        checkEqual();
        compareLines();
    }
}