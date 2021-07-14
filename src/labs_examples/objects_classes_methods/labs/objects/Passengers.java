package labs_examples.objects_classes_methods.labs.objects;

public class Passengers {
    private double numberOfPassengers;
    private int numberOfFlightAttendants;
    private int numberOfChildren;
    private int numberOfAnimals;

    public Passengers(double numberOfPassengers, int numberOfFlightAttendants, int numberOfChildren, int numberOfAnimals) {
        this.numberOfPassengers = numberOfPassengers;
        this.numberOfFlightAttendants = numberOfFlightAttendants;
        this.numberOfChildren = numberOfChildren;
        this.numberOfAnimals = numberOfAnimals;
    }

    public double getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(double numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfFlightAttendants() {
        return numberOfFlightAttendants;
    }

    public void setNumberOfFlightAttendants(int numberOfFlightAttendants) {
        this.numberOfFlightAttendants = numberOfFlightAttendants;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public int getNumberOfAnimals() {
        return numberOfAnimals;
    }

    public void setNumberOfAnimals(int numberOfAnimals) {
        this.numberOfAnimals = numberOfAnimals;
    }
}
