package exercises;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the rectangle? (must be whole number)");
        int length = input.nextInt();

        System.out.println("What is the width of the rectangle? (must be whole number)");
        int width = input.nextInt();
        input.close();

        int area = length * width;

        System.out.println("The area of the rectangle is: " + area);
    }
}
