package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class MethodTraining {

    public static void main(String[] args) {

        Car firstCar = new Car(2016, "Subaru", "STi");

        String constants = "hn R 9vy";

        int a = 3;
        int b = 634;
        int c = 1234;
        int d = 53;

        int[] numericArray = new int[]{3, 543, 345, 53, 75, 783, 1, 7};

        //calls the same method but with different parameters to overload the method
        overloadThis(a, b);
        overloadThis(a, b, c);

        //pass by value where the value isn't modified outside of the method
        System.out.println("The value of a and b before passByValue is called. A = " + a + ". B = " + b);
        passByValue(a, b);
        System.out.println("The value of a and b after passByValue is called. A = " + a + ". B = " + b);

        //pass by reference where the value is modified in the method and the value is now changed outside of the method
        System.out.println("Before the year of car is modified " + firstCar.year);
        passByReference(firstCar);
        System.out.println("After the year of car is modified " + firstCar.year);

        System.out.println(largestNumber(a, b, c, d));

        countConstants(constants);
        primeNumbers(a);
        System.out.println(Arrays.toString(highLowNumber(numericArray)));

        //used for the arrayList #7
        int maxNum = 5185;
        int divisor1 = 3;
        int divisor2 = 55;
        System.out.println(returnAnArrayList(maxNum, divisor1, divisor2));

        //#8
        int[] reverse = new int[]{3, 6, 2, 8, 234, 64, 62, 3452345, 424};
        System.out.println(Arrays.toString(reverseArray(reverse)));

    }

    public static void overloadThis(int a, int b) {
        System.out.println(a + b);
    }

    public static void overloadThis(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void passByValue(int a, int b) {
        a = a * 343;
        System.out.println("This is the reference value of a that has been modified only within this method for b: " + a);
        b = b * 24432;
        System.out.println("This is the reference value of a that has been modified only within this method for a: " + b);
    }

    public static void passByReference(Car firstCar) {
        //modifies the actual value of the firstCar object
        firstCar.year = 2020;
    }

    public static int largestNumber(int a, int b, int c, int d) {
        int largest = a;
        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }
        if (d > largest) {
            largest = d;
        }
        return largest;
    }

    public static void countConstants(String constants) {
        int count = 0;
        int vowelCount = 0;
        String constantsLower = constants.toLowerCase(Locale.ROOT);
        String alphaString = constantsLower.replaceAll("[^a-z]", "");
        while (count < alphaString.length()) {
            if (constants.charAt(count) == 'a' || constants.charAt(count) == 'e' || constants.charAt(count) == 'i' || constants.charAt(count) == 'o' || constants.charAt(count) == 'u') {
                vowelCount = vowelCount + 1;
            }
            count++;
        }
        int constantCount = alphaString.length() - vowelCount;
        System.out.println("The number of constants in the string is: " + constantCount);
    }

    public static void primeNumbers(int a) {
        if ((a > 1) && (a % 3 == 0 || a % 2 == 0) || (a != 5 && a % 5 == 0)) {
            System.out.println(a + " is not a prime number.");
        }
            else {
            System.out.println(a + " is a prime number.");
        }
    }

    public static int[] highLowNumber(int[] numericArray) {
        int max = numericArray[0];
        int min = numericArray[0];
        for (int i = 0; i < numericArray.length; i++) {
            if (numericArray[i] > max) {
                max = numericArray[i];
            }
            if (numericArray[i] < min) {
                min = numericArray[i];
            }
        }

        return new int[]{max, min};
    }

    public static ArrayList returnAnArrayList(int maxNum, int divisor1, int divisor2) {

        ArrayList<Integer> zeroToMaxNum = new ArrayList<>();

        for (int i = 0; i <= maxNum; i++) {
            if (i % divisor1 == 0 && i % divisor2 ==0) {
                zeroToMaxNum.add(i);
            }
        }

        return zeroToMaxNum;
    }

    public static int[] reverseArray(int[] reverse) {
        for (int i = 0; i < reverse.length/2; i++) {
            int temp = reverse[i];
            reverse[i] = reverse[reverse.length -1 -i];
            reverse[reverse.length -1 -i] = temp;
        }
        return reverse;
    }
}
