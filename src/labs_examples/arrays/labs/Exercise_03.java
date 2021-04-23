package labs_examples.arrays.labs;

/**
 * 2D Array
 * <p>
 * Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 * <p>
 * The output should look something like this:
 * <p>
 * 3 6 9 12 15
 * 18 21 24 27 30
 * ...
 * ...
 * ...
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int[][] multipleDArray = new int[5][5];
        int multipleOfThree = 0;
        //populate 2d array
        for (int i = 0; i < multipleDArray.length; i++) {
            for (int j = 0; j < 5; j++) {
                multipleDArray[i][j] = 3 + multipleOfThree;
                multipleOfThree += 3;
            }
        }
        //print 2d array
        for (int i = 0; i < multipleDArray.length; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(multipleDArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
