package labs_examples.objects_classes_methods.labs.objects;

public class Cockpit {

    private boolean hasCaptain;
    private boolean hasCoPilot;
    private int numberOfButtons;
    private boolean isDoorPressurized;

    public Cockpit(boolean hasCaptain, boolean hasCoPilot, int numberOfButtons, boolean isDoorPressurized) {
        this.hasCaptain = hasCaptain;
        this.hasCoPilot = hasCoPilot;
        this.numberOfButtons = numberOfButtons;
        this.isDoorPressurized = isDoorPressurized;
    }

    public boolean isHasCaptain() {
        return hasCaptain;
    }

    public void setHasCaptain(boolean hasCaptain) {
        this.hasCaptain = hasCaptain;
    }

    public boolean isHasCoPilot() {
        return hasCoPilot;
    }

    public void setHasCoPilot(boolean hasCoPilot) {
        this.hasCoPilot = hasCoPilot;
    }

    public int getNumberOfButtons() {
        return numberOfButtons;
    }

    public void setNumberOfButtons(int numberOfButtons) {
        this.numberOfButtons = numberOfButtons;
    }

    public boolean isDoorPressurized() {
        return isDoorPressurized;
    }

    public void setDoorPressurized(boolean doorPressurized) {
        isDoorPressurized = doorPressurized;
    }

    @Override
    public String toString() {
        return "Cockpit{" +
                "hasCaptain=" + hasCaptain +
                ", hasCoPilot=" + hasCoPilot +
                ", numberOfButtons=" + numberOfButtons +
                ", isDoorPressurized=" + isDoorPressurized +
                '}';
    }
}
