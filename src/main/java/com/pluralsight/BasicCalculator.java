package com.pluralsight;
import java.util.Scanner;

public class BasicCalculator {
    public static void main (String [] args) {


Scanner scanner = new Scanner (System.in);

    System.out.print ("Enter the first number: ");
        float num1 = scanner.nextFloat();

    System.out.print ("Enter the second number: ");
        float num2 = scanner.nextFloat();

    System.out.println ("Possible calculations:");
    System.out.println ("(A)dd");
    System.out.println ("(S)ubtract");
    System.out.println ("(M)ultiply");
    System.out.println ("(D)ivide");

scanner.nextLine();

    System.out.print ("Please select an option: ");
        String option = scanner.nextLine();

    float A = num1 + num2;
    float S = num1 - num2;
    float M = num1 * num2;
    float D = num1 / num2;

    // How do I let the computer know that if a certain character is selected to do that calculation?

    System.out.println ("Your calculations are: " + A);
    System.out.println ("Your calculations are: " + S);
    System.out.println ("Your calculations are: " + M);
    System.out.println ("Your calculations are: " + D);




    }
}
