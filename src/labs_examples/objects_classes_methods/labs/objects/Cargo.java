package labs_examples.objects_classes_methods.labs.objects;

public class Cargo {
    private boolean hasLuggage;
    private double numberOfSuitcases;
    private double numberOfOddLuggage;

    public Cargo(boolean hasLuggage, double numberOfSuitcases, double numberOfOddLuggage) {
        this.hasLuggage = hasLuggage;
        this.numberOfSuitcases = numberOfSuitcases;
        this.numberOfOddLuggage = numberOfOddLuggage;
    }

    public boolean isHasLuggage() {
        return hasLuggage;
    }

    public void setHasLuggage(boolean hasLuggage) {
        this.hasLuggage = hasLuggage;
    }

    public double getNumberOfSuitcases() {
        return numberOfSuitcases;
    }

    public void setNumberOfSuitcases(double numberOfSuitcases) {
        this.numberOfSuitcases = numberOfSuitcases;
    }

    public double getNumberOfOddLuggage() {
        return numberOfOddLuggage;
    }

    public void setNumberOfOddLuggage(double numberOfOddLuggage) {
        this.numberOfOddLuggage = numberOfOddLuggage;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "hasLuggage=" + hasLuggage +
                ", numberOfSuitcases=" + numberOfSuitcases +
                ", numberOfOddLuggage=" + numberOfOddLuggage +
                '}';
    }
}
