package org.launchcode;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        double radius = input.nextDouble();
        double result = multiply(radius);
        System.out.println("The area of a circle with a radius of " + radius+ " is: " + result);

    }
    public static double multiply(double radius) {return Circle.getArea(radius);}
}
