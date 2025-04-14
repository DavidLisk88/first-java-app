package com.pluralsight;
// Import a scanner above the class:
import java.util.Scanner;


public class ScannerDemo {
    public static void main(String[] args) {


        Scanner myScanner = new Scanner(System.in);

        // Ask user a question:
        System.out.print("Enter your name: ");

        // Waits for user to enter something:
        String name = myScanner.nextLine();

        // Say hello to the user:
        System.out.println("Howdy " + name);

        System.out.print("How old are you?: ");

        int age = myScanner.nextInt();

        System.out.print("Wow you look great for " + age + "!");



























    }
}
