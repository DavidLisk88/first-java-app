package RentalCarCalculator;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;


public class RentalCarCalculator {

    //create the scanner to capture user input
    static Scanner userInput = new Scanner(System.in);

   // static SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/Y");
    public static void main(String[] args) {
        String userDate = "^(0[1-9]|1[0-2])/([0-2][0-9]|3[01])/[0-9]{4}$";
        String inputDate;
        //ask user for a date and store it as a string
        System.out.println("What is the pickup date?");
        // String SdateFormat = userInput.nextLine();


        boolean trueLoop = true;
        while (trueLoop) { inputDate = userInput.nextLine();
            if (Pattern.matches(userDate, inputDate)) {
                System.out.println("Your pickup date is " + inputDate);
                trueLoop = false;
                break; //the break exits loop after valid input is recieved.
            } else {
                System.out.println("Invalid input. Please use 00/00/0000 format.");
            }
        } //end of while loop

        //ask the user the number of days for the rental
        //store that as a int
        System.out.println("How many days are you renting for?");
        int numOfDays = userInput.nextInt();

        //fix the wierd carriage return from the above scanner
        userInput.nextLine();

        //do you want an electronic toll tag 3.95 upcharge per day
        //store answer as a string
        System.out.println("Toll tag? (3.95/per day) (y/n)");
        String tollTag = userInput.nextLine();


        //do you want a gps? 2.95 per day
        System.out.println("GPS? (2.95/per day) (y/n)");
        String gps = userInput.nextLine();

        //do you want a roadside assistance? 3.95 per day
        System.out.println("Roadside Assistance? (3.95/per day) (y/n)");
        String roadsideAssistance = userInput.nextLine();

        //we need to ask their age
        System.out.println("How old are you?");
        int age = userInput.nextInt();

        //calculate the base rental price 29.99 per day
        double basePrice = 29.99 * numOfDays;

        //start options cost at 0, they dont have an options cost unless they pick options
        double optionsCost = 0;
        //figure out the options cost (gps + toll + roadside assistance)
        if (tollTag.equalsIgnoreCase("y")) {
            optionsCost += 3.95;
        }

        if (gps.equalsIgnoreCase("y")) {
            optionsCost += 2.95;
        }

        if (roadsideAssistance.equalsIgnoreCase("y")) {
            optionsCost += 3.95;
        }

        //genearate total options cost
        optionsCost *= numOfDays;

        double subTotal = basePrice + optionsCost;

        double surcharge = 0;
        if (age < 25) {
            surcharge = subTotal * .3;
        }

        double total = subTotal + surcharge;


        //display some information
        //basic car rental price
        //options cost
        //underage driver surcharge
        //total cost
        System.out.printf("Base Rental Cost $%.2f%n", basePrice);
        System.out.printf("Options Cost $%.2f%n", optionsCost);
        System.out.printf("Underage surcharge $%.2f%n", surcharge);
        System.out.printf("Cost $%.2f", total);


    }

}









