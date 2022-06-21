package com.bridgelabz;
/*
 * @author: Nikhil Deshmukh
 * As a fan of geometry, I want to model a line based on a point consisting of (x, y)
 * co-ordinates using the Cartesian system, So that I can calculate its length.
 */

import java.util.Scanner;

public class LineComparison {
    // Declare Instance variables
    int x1;
    int y1;
    int x2;
    int y2;

    // Method to getting line co-ordinates
    public void enterCoordinatesValues() {
        // Creating object of Scanner class for User Input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Coordinates of Line x1,y1: ");
        x1 = scan.nextInt();
        y1 = scan.nextInt();
        System.out.println("Enter Coordinates of Line x2,y2: ");
        x2 = scan.nextInt();
        y2 = scan.nextInt();
    }

    public static void main(String[] args) {
        // Showing Welcome message to console
        System.out.println("Welcome to line comparison");
        // Creating Object of LineComparison class
        LineComparison lineComparison1 = new LineComparison();
        lineComparison1.enterCoordinatesValues();
        System.out.print("Length of the Line: " + lineComparison1.calculateLength());
    }

    // Method to calculate the length of the line
    public int calculateLength() {
        int length = (int) Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        return length;
    }
}