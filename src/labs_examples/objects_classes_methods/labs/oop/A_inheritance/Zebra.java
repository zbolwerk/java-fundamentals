package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Zebra extends Mammal {
    private boolean isHasMane;
    private int numberOfStripes;

    public Zebra(String hairType, boolean isHasLungs) {
        super(hairType, isHasLungs);
    }

    public Zebra(String hairType, boolean isHasLungs, int numberOfStripes) {
        super(hairType, isHasLungs);
        this.numberOfStripes = numberOfStripes;
    }

    @Override
    public void movement() {
        System.out.println("Zebra is galloping.");
        super.movement();
    }

    public boolean isHasMane() {
        return isHasMane;
    }

    public void setHasMane(boolean hasMane) {
        isHasMane = hasMane;
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }
}
