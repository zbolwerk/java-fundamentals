package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if (i < 99) {
                if (i % 33 == 3) {
                    System.out.println("Bingo!");
                    break;
                    //break here or you will print out "Bingo!" three times since the condition is met 3 times and it only needs to be met once to print in this scenario.
                }
            }
        }
    }
}
