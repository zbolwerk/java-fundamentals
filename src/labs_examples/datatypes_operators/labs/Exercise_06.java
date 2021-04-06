package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        double radius = 3.14;
        int height = 5;

        double volume = 3.141592653589793238 * (radius * radius) * height;
        System.out.println("The volume of the cylinder is: " + volume);
        double surfaceArea = (2 * 3.141592653589793238 * radius * height) + (2 * 3.141592653589793238 * (radius * radius));
        System.out.println("The surface area of the cylinder is: " + surfaceArea);
    }
}