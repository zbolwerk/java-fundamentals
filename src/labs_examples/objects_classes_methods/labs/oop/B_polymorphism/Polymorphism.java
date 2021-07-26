package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Polymorphism {
    int tires;
    int fuelCapacity;
    int doors;


    public static void main(String[] args) {
        Polymorphism poly = new Polymorphism();
        Poly2 poly2 = new Poly2();
        Poly3 poly3 = new Poly3();

        poly.Overload(3, 5);
        poly2.OverloadThis();
        poly3.OverloadThis();
    }

    public int getTires() {
        return tires;
    }

    public void setTires(int tires) {
        this.tires = tires;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void  Overload (int tires, int doors) {
        System.out.println("This has " + tires + "tires and " + doors + " doors.");
    }
    public void Overload (int tires, int doors, int fuelCapacity) {
        System.out.println("This one has " + fuelCapacity + " gallons of gas.");
    }

}
class Poly2 extends Polymorphism {
        public void OverloadThis () {
            System.out.println("Overrides the thing for Poly2.");
        }

}
class Poly3 extends Poly2 {

    @Override
    public void OverloadThis () {
        System.out.println("Overrides Poly2 inside of Poly3.");
    }

    class Poly4 implements InterfaceThis {

        @Override
        public boolean eat() {
            return false;
        }

        @Override
        public void sleep() {
            System.out.println("sleep now.");
        }

        @Override
        public void weight(int weight) {
            System.out.println("oof, that's a lot of weight.");
        }

    }
}
