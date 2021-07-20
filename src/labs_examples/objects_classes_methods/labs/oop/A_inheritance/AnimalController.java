package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class AnimalController {
    public static void main(String[] args) {

        Dolphin dolphin = new Dolphin("None", true, 234, 35);
        Dog dog = new Dog("Red", true, 25, 15);
        Zebra zebra = new Zebra("Stripped", true, 375);
        Mammal mammal = new Mammal("Black", true);

        mammal.sleep();
        dog.eat();
        System.out.println(dolphin.getSwimDepth());

    }
}
