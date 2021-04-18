package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 3: Months of the year
 *
 *      Take in a number from the user and print "January", "February", ... "December", or "Other"
 *      if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement.
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter in a number for the month of the year.");
        int month = scanner.nextInt();

        switch (month){
            case 1:
                System.out.println("Your month is January.");
                break;
            case 2:
                System.out.println("Your month is February.");
                break;
            case 3:
                System.out.println("Your month is March.");
                break;
            case 4:
                System.out.println("Your month is April.");
                break;
            case 5:
                System.out.println("Your month is May.");
                break;
            case 6:
                System.out.println("Your month is June.");
                break;
            case 7:
                System.out.println("Your month is July.");
                break;
            case 8:
                System.out.println("Your month is August.");
                break;
            case 9:
                System.out.println("Your month is September.");
                break;
            case 10:
                System.out.println("Your month is October.");
                break;
            case 11:
                System.out.println("Your month is November.");
                break;
            case 12:
                System.out.println("Your month is December.");
                break;
            default:
                System.out.println("This is not a real month value.");
                break;
        }

    }

}
