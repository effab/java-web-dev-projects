package org.launchcode;

import java.util.Scanner;
public class MPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        Double numMiles = input.nextDouble();

        System.out.println("How many gallons have gas have you used?");
        Double gallons = input.nextDouble();

        double milesPerGallon = numMiles / gallons;
        System.out.println("You are running on " + milesPerGallon + " mpg.");
        }
}
