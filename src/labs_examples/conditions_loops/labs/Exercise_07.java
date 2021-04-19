package labs_examples.conditions_loops.labs;

import java.util.Locale;
import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 * <p>
 * Take in a word from the user and using a "while" loop, find the first vowel in the word.
 * Once you find the vowel, print out the word and the first vowel.
 * <p>
 * Hints:
 * - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 * - you'll likely want to use a String that contains all the vowels:
 * - ie: String vowels = "aeiou";
 */

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter in a word. ");
        String word = scanner.nextLine();
        int count = 0;
        String lowerWord = word.toLowerCase(Locale.ROOT);

        while (count < lowerWord.length()) {
            if (word.charAt(count) == 'a' || word.charAt(count) == 'e' || word.charAt(count) == 'i'
                    || word.charAt(count) == 'o' || word.charAt(count) == 'u') {
                char vowel = word.charAt(count);
                System.out.println("The word is: '" + word + "' and the first vowel is: " + vowel);
                break;
            }
            count++;
        }
    }
}
