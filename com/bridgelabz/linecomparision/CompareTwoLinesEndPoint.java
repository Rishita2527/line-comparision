package com.bridgelabz.linecomparision;
import java.util.Scanner;

public class CompareTwoLinesEndPoint {
    public static void main(String[] args) {
        System.out.println("Welcome to line computation program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the x1 value");
        double x1 = scanner.nextDouble();
        System.out.println("Enter the x2 value");
        double x2 = scanner.nextDouble();
        System.out.println("Enter the y1 value");
        double y1 = scanner.nextDouble();
        System.out.println("Enter the y2 value");
        double y2 = scanner.nextDouble();
        double line1 = Math.sqrt((x2 - x1)  + (y2 - y1));
        System.out.println("First line value is  "+line1);
        double line2 = Math.sqrt((x2 - x1)  - (y2 - y1));
        System.out.println("Second line value is  "+line2);
        System.out.println("------------------------------------");
        System.out.println("Check equality of the two lines--->");
        System.out.println("-------------------------------------");
        if(line1==line2){
            System.out.println("Two lines are Equal");
        }else{
            System.out.println("Two lines are not Equal");
        }
        System.out.println("---------------------------------------");
        System.out.println("Comparing the two lines--->");
        System.out.println("--------------------------------------");
        if(line1>line2){
            System.out.println("Line1 is maximum");
        }else{
            System.out.println("Line2 is the maximum");
        }
    }
}