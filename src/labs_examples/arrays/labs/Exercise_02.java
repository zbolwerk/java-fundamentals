package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * More labs_examples.arrays
 * <p>
 * Using the array below, take in a number from 1-10 from the user and print out the index of that
 * element.
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Scanner scanner = new Scanner(System.in);
        // write code here

        System.out.println("Please enter in a number between 1 and 10.");
        int userNumber = scanner.nextInt();

        if (userNumber > 0 && userNumber <= 10) {
            for (int i = 0; i < array.length; i++) {
                if (userNumber == array[i]) {
                    System.out.printf("The index for %s is %s", userNumber, i);
                }
            }
        } else {
            System.out.println("Invalid number.");
        }

    }
}