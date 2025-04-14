package com.pluralsight;
import java.util.Scanner;
public class SimplECalculator {
    public static void main(String[] args){ {
        Scanner myCalculator = new Scanner(System.in);

        System.out.println("Welcome to my addition machine!");

        System.out.println("What is the first number we are going to add?: ");
        int numb1 = myCalculator.nextInt();

        System.out.println("What is the first number we are going to add?: ");
        int numb2 = myCalculator.nextInt();

        int sum = numb1 + numb2;

        System.out.println("The sum is: " + sum);


    }

    class addnumbers {
        int result = addNumbers(5, 10);

        public static int addNumbers(int potato1, int potato2) {
            return potato1 + potato2;

            System.out.println(re);
        }
    }
}