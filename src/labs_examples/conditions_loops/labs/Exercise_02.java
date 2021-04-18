package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 * <p>
 * Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 * if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 * to accomplish this task.
 * <p>
 * Bonus Tricky Challenge: Use a "nested-if" statement.
 */


//You want Monday to be 1 instead of Sunday??


public class Exercise_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter in a number between 1 and 7: ");
        int number = scanner.nextInt();
        // 1) create scanner (don't forget to import Scanner!)
        // 2) prompt user
        // 3) assign input to variable as int
        // 4) write completed code here
        if (number > 0 && number <= 7) {
            if (number == 1) {
                System.out.println("The day of the week is Monday.");
            }
            if (number == 2) {
                System.out.println("The day of the week is Tuesday.");
            }
            if (number == 3) {
                System.out.println("The day of the week is Wednesday.");
            }
            if (number == 4) {
                System.out.println("The day of the week is Thursday.");
            }
            if (number == 5) {
                System.out.println("The day of the week is Friday.");
            }
            if (number == 6) {
                System.out.println("The day of the week is Saturday.");
            }
            if (number == 7) {
                System.out.println("The day of the week is Sunday.");
            }
        } else {
            System.out.println("The day of the week is Other.");
        }
    }
}
