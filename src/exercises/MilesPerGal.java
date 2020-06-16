package exercises;

import java.util.Scanner;

public class MilesPerGal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        double miles = input.nextDouble();

        System.out.println("How much gas have you consumed?");
        double gallonsOfGas = input.nextDouble();
        input.close();

        double milesPerGal = miles / gallonsOfGas;
        System.out.println("Your car ran at: " + milesPerGal + "mpg");
    }
}
