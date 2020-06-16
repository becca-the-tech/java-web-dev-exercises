package org.launchcode.java.demos.lsn1datatypes;

import java.util.Scanner;

public class HelloMethods {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 2 letters of your language of choice: ");
        String language = input.next();
        input.close();
        String message = Message.getMessage(language);
        System.out.println(message);
    }

}
