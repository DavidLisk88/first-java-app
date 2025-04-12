package com.pluralsight;

public class MathApp {

        // This is the main method and where my code will run free
        // all code for this exercise will be in this main method
    public static void main(String[] args) {


        /*
        1. Create two variables to represent the salary for Bob and Gary, name them
bobSalary and garySalary. Create a new variable named
highestSalary. Determine whose salary is greater using Math.max() and
store the answer in highestSalary. Set the initial salary variables to any value
you want. Print the answer (i.e "The highest salary is ...")
         */
            int bobSalary = 55000;
            int garySalary = 100000;

            int highestSalary = Math.max(bobSalary, garySalary);

            System.out.println("The highest Salary is " + highestSalary);

            System.out.println("--------------------------------------------");

            /*
            2. Find and display the smallest of two variables named carPrice and
                truckPrice. Set the variables to any value you want
             */
            int carPrice = 12000;
            int truckPrice = 44000;

            System.out.println("The lowest price is " + Math.min(carPrice, truckPrice));
            System.out.println("----------------------------------");
            /*
            3. Find and display the area of a circle whose radius is 7.25
             */
            double radius = 7.25;
            System.out.println(("The area of the circle is " + Math.round(Math.PI * 7.25)));

            System.out.println("----------------------------------");

            /*
            4. Find and display the square root a variable after it is set to 5.0
             */
            double variable = 5.0;
            System.out.println("The square root of 5 is " + Math.sqrt(5.0));

        System.out.println("----------------------------------");

            /*
            5. Find and display the distance between the points (5, 10) and (85, 50)
             */
            int five = 5;
            int ten = 10;
            int eightyFive = 85;
            int fifty = 50;

            double distance = Math.sqrt(Math.pow(85 - 5, 2) + Math.pow(50 - 10, 2));
            System.out.println("The distance is " + distance);
            System.out.println("----------------------------------");
            /*
            6. Find and display the absolute (positive) value of a variable after it is set to -3.8
             */
            double decimal = -3.8;
            double absoluteValue = Math.abs(decimal);

            System.out.println("The absolute value is " + absoluteValue);
            System.out.println("----------------------------------");
            /*
            7. Find and display a random number between 0 and 1
             */
            double between = Math.random();
            System.out.println(between);

    }
}


