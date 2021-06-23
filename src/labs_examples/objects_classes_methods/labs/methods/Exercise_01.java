package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        int a = 64;
        int b = 5;
        int years = 3244;
        String joke = "Pete and Repeat were in a boat. Pete fell out, who was left?";
        int oneArgs = varargsMethod("First");
        int twoArgs = varargsMethod("First", "Second");



        System.out.println(multiply(a, b));
        System.out.println(divide(a, b));
        jokes(joke);
        System.out.println("There are " + String.format("%,d",yearsToSeconds(years)) + " seconds in " + years + " years.");
        System.out.println("One word is: " + oneArgs);
        System.out.println("Two words is: " + twoArgs);


    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b) {

        return a * b;
    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b

    public static int divide(int a, int b) {

        return a / b;
    }


    // 3) Create a static void method that will print of joke of your choice to the console

    public static void jokes(String joke) {
        System.out.println(joke);
    }


    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents

    public static long yearsToSeconds(int years) {
        long secondsInYear = 31536000;
        return years * secondsInYear;
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in

    public static int varargsMethod (String...args) {
        int count = 0;
        for (String word : args) {
            count++;
        }
        return count;
    }

}
