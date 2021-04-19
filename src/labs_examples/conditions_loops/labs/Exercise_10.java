package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 7) {
                //i will be 7 when entering and will continue back to the start of the loop thus skipping printing the number 7.
                continue;
            }
            System.out.println(i);
        }
    }
}
