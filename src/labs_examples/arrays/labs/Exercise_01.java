package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 * <p>
 * Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 * calculate the sum of all of the numbers in the array as well as the average.
 * <p>
 * Print the results to the console.
 */

public class Exercise_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter in 10 numbers with each number followed by the enter key.");
        int[] nums = new int[10];
        double numberSum = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int sum : nums) {
            numberSum = numberSum + sum;
        }
        double average = numberSum / 10;
        System.out.printf("The sum of your numbers is: %s and the average is: %s.", numberSum, average);

    }

}