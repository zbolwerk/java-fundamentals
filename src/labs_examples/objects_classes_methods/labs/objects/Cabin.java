package labs_examples.objects_classes_methods.labs.objects;

public class Cabin {
    private boolean hasPassengers;
    private boolean hasFlightAttendants;
    private int numberOfEmptySeats;
    private int numberOfFullSeats;
    private int numberOfSeats;
    private int numberOfIsles;
    private double numberOfOverheadCompartments;

    public Cabin(boolean hasPassengers, boolean hasFlightAttendants, int numberOfEmptySeats, int numberOfFullSeats, int numberOfSeats, int numberOfIsles, double numberOfOverheadCompartments) {
        this.hasPassengers = hasPassengers;
        this.hasFlightAttendants = hasFlightAttendants;
        this.numberOfEmptySeats = numberOfEmptySeats;
        this.numberOfFullSeats = numberOfFullSeats;
        this.numberOfSeats = numberOfSeats;
        this.numberOfIsles = numberOfIsles;
        this.numberOfOverheadCompartments = numberOfOverheadCompartments;
    }

    public boolean isHasPassengers() {
        return hasPassengers;
    }

    public void setHasPassengers(boolean hasPassengers) {
        this.hasPassengers = hasPassengers;
    }

    public boolean isHasFlightAttendants() {
        return hasFlightAttendants;
    }

    public void setHasFlightAttendants(boolean hasFlightAttendants) {
        this.hasFlightAttendants = hasFlightAttendants;
    }

    public int getNumberOfEmptySeats() {
        return numberOfEmptySeats;
    }

    public void setNumberOfEmptySeats(int numberOfEmptySeats) {
        this.numberOfEmptySeats = numberOfEmptySeats;
    }

    public int getNumberOfFullSeats() {
        return numberOfFullSeats;
    }

    public void setNumberOfFullSeats(int numberOfFullSeats) {
        this.numberOfFullSeats = numberOfFullSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfIsles() {
        return numberOfIsles;
    }

    public void setNumberOfIsles(int numberOfIsles) {
        this.numberOfIsles = numberOfIsles;
    }

    public double getNumberOfOverheadCompartments() {
        return numberOfOverheadCompartments;
    }

    public void setNumberOfOverheadCompartments(double numberOfOverheadCompartments) {
        this.numberOfOverheadCompartments = numberOfOverheadCompartments;
    }
}
