package labs_examples.arrays.labs;
import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        ArrayList<String> secondList = new ArrayList<>();
        cars.add("Porsche");
        cars.add("Ford");
        cars.add("Jeep");
        cars.add("Subaru");

        System.out.println(cars.indexOf("Jeep"));

        secondList = (ArrayList)cars.clone();
        System.out.println(secondList.indexOf("Subaru"));

    }
}
