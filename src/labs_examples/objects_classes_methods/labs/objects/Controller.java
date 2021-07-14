package labs_examples.objects_classes_methods.labs.objects;


public class Controller {
    public static void main(String[] args) {
        Cockpit c = new Cockpit(true, true, 4234, true);
        Cabin ca = new Cabin(true, true, 23, 232, 255, 1, 23);
        System.out.println("The cockpit has " + c.getNumberOfButtons() + " buttons and " + ca.getNumberOfSeats() + " seats on the plane.");

        Person person1 = new Person(124, 234);
        Person person2 = new Person("Blonde", "Blue");
        Person person3 = new Person(220, 125, "Black", "Brown");

        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());


    }

}
