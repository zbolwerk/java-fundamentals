package labs_examples.arrays.labs;

/**
 * Traversing Arrays Backwards
 * <p>
 * Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 * element in the array in reverse order.
 */

public class Exercise_05 {

    public static void main(String[] args) {
        int[] reversePrint = {4, 6, 3, 4, 6, 3, 3, 0, 32, 343, 324};
        int count = reversePrint.length - 1;
        for (int i = reversePrint.length - 1; i > 0; i--) {
            if (count >= 0) {
                System.out.println(reversePrint[count]);
                count -= 2;
            }
        }
    }
}
