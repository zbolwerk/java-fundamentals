package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 * <p>
 * Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 * of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 * Print the results to the console.
 * <p>
 * For example, if a user enters 1 and 100, the output should be:
 * <p>
 * The sum is: 5050
 * The average is: 50.5
 */

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter in two positive numbers separated by a space. \n");
        double firstNum = scanner.nextInt();
        double secondNum = scanner.nextInt();
        int sum = 0;
        double averageNum = (firstNum + secondNum) / 2;

        for (double i = firstNum; i <= secondNum; i++) {
            sum = (int) (sum + i);
        }
        System.out.println("The sum of your two numbers is: " + sum);
        System.out.println("The average of your two numbers is: " + averageNum);
    }
}
