package BasicCalculator;
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {

        Scanner basicCalc = new Scanner(System.in);

        System.out.println("Enter first number: ");

         float num1 = basicCalc.nextFloat();

        System.out.println("Enter second number: ");

        float num2 = basicCalc.nextFloat();

        String operation = " ";
        boolean f = false;
        while (!f){
            System.out.println("Possible calculations:");
            System.out.println("(A)dd");
            System.out.println("(S)ubtract");
            System.out.println("(M)ultiply");
            System.out.println("(D)ivide");


            operation = basicCalc.nextLine().toUpperCase();
            if (operation.equals("A")||operation.equals("S")||operation.equals("M")||operation.equals("D")){
                f = true;
            }
            else {
                System.out.println("Error.");
            }
        }
        float result = 0;

        if (operation.equals("A")){
            result = num1 + num2;
        }
        else if (operation.equals("S")){
            result = num1 - num2;
        }
        else if (operation.equals("M")){
            result = num1 * num2;
        }
        else if (operation.equals("D")){
            result = num1 / num2;
        }


        System.out.println("Doing calculation... ");
        System.out.println("Your result is: " + result);











    }
}
