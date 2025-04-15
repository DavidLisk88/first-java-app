package SandwhichShop;
import javax.security.sasl.SaslClient;
import java.util.Scanner;
public class SandwhichShop {
    public static void main(String[] args) {
        // set scanner
        Scanner sandwhich = new Scanner(System.in);
        // set variables for prices
        double regularPrice = 5.45;
        double largePrice = 8.95;
        String regular = "Regular";
        String large = "Large";
        double discount1 = 10.00;
        double discount2 = 20.00;
        int age = 0;

        System.out.println("Which sandwhcih would you like?: ");
        String sandwhichType = " ";

        boolean f = true;
        while (f) { sandwhichType = sandwhich.nextLine();
            if (sandwhichType.equalsIgnoreCase(regular)) {
                System.out.println("You want a Regular Sandwhich."); f = false;
            } else if (sandwhichType.equalsIgnoreCase(large)) {
                System.out.println("You want a large sandwhcih."); f = false;
            } else {
                System.out.println("Not an option. Please type either Regular or Large.");
            }

        }
        System.out.println("How old are you?: ");

        f = true;
        while (f) { age = sandwhich.nextInt();
            if (sandwhichType.equalsIgnoreCase(regular)) {
                if (age <= 17) {
                    System.out.println("You'll get 10% off! \n Your price is: $" + regularPrice * (100 - discount1 / 100.0)); f = false;
                }
                else if (age >= 65) {
                    System.out.println("You'll get 20% off! \n Your price is: $" + regularPrice * (100 - discount2 / 100.0)); f = false;
                } else {
                    System.out.println("Your price is: $" + regularPrice);
                }
            } else if (sandwhichType.equalsIgnoreCase(large)) {

                if (age <= 17) {
                    System.out.println("You'll get 10% off! \nYour price is: $" + largePrice * ((100 - discount1) / 100.0)); f = false;
                }
                else if (age >= 65) {
                    System.out.println("You'll get 20% off! \nYour price is: $" + largePrice * (100 - discount2 / 100.0)); f = false;
                } else {
                    System.out.println("Your price is: $" + largePrice);
                }
            }
            System.out.println("Thank you! Come again.");

        }

        sandwhich.close();
    }

}
