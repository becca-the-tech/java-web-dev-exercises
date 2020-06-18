package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;


public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double radius;

       try {
            do {
                System.out.println("Enter a radius: (must be positive non-zero number)");
                radius = input.nextDouble();
            } while (radius <= 0);

            double area = Circle.getArea(radius);
            input.close();
            System.out.println("The area of a circle of radius " + radius + " is: " + area);

        }
        catch (Exception e) {
            System.err.println("Error: user entered invalid data type.");
        }


    }
}
