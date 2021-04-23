package labs_examples.arrays.labs;

/**
 * Irregular Arrays
 * <p>
 * Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 * "for-each" loop, iterate and print out each element of the array.
 */

public class Exercise_04 {
    public static void main(String[] args) {
        String[][] irregular = {
                {"cats", "dogs"},
                {"PC", "Xbox", "Playstation"},
                {"chair"}
        };
        for (String[] innerArray : irregular) {
            for (String val : innerArray) {
                System.out.println(val);
            }
            System.out.println();
        }
    }
}
