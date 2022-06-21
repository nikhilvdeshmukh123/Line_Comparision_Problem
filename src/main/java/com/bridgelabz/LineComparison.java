package com.bridgelabz;
/*
 * @author: Nikhil Deshmukh
 * As a fan of geometry, I want to compare two lines based on the end points,
 * So that I know one line is equal, greater or less than the other line.
 */

import java.util.Scanner;

public class LineComparison {
    // Declare Instance variables
    int x1, y1, x2, y2;

    // Method to getting line co-ordinates
    public void enterCoordinatesValues() {
        // Creating object of Scanner class for User Input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Co-ordinates of point1 x1,y1: ");
        x1 = scan.nextInt();
        y1 = scan.nextInt();
        System.out.println("Enter Co-ordinates of point2 x2,y2: ");
        x2 = scan.nextInt();
        y2 = scan.nextInt();
    }

    // Method to calculate the length of the line
    public int calculateLength() {
        return (int) Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
    }

    // Method to compare two lines
    public void compareTwoLines(Integer length1, Integer length2) {
        if (length1.compareTo(length2) == 0) {
            System.out.println("Both lines are equal");
        } else if (length1.compareTo(length2) < 0) {
            System.out.println("Line1 is smaller than line2");
        } else if (length1.compareTo(length2) > 0) {
            System.out.println("Line1 is greater than line2");
        }
    }

    public static void main(String[] args) {
        // Showing Welcome message to console
        System.out.println("Welcome to Line Comparison Computation Program");
        // Creating Object of LineComparison class
        LineComparison lineComparison1 = new LineComparison();
        System.out.println("Enter co-ordinates of line1: ");
        lineComparison1.enterCoordinatesValues();
        LineComparison lineComparison2 = new LineComparison();
        System.out.println("Enter co-ordinates of line2: ");
        lineComparison2.enterCoordinatesValues();
        int length1 = lineComparison1.calculateLength();
        System.out.println("Length of Line1: " + length1);
        int length2 = lineComparison2.calculateLength();
        System.out.println("Length of Line2: " + length2);
        LineComparison lineComparison = new LineComparison();
        lineComparison.compareTwoLines(length1, length2);
    }
}