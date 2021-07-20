package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public abstract class Zebra extends Mammal {
    private boolean isHasMane;
    private int numberOfStripes;

    public Zebra(String hairType, boolean isHasLungs) {
        super(hairType, isHasLungs);
    }

    public Zebra(String hairType, boolean isHasLungs, int numberOfStripes) {
        super(hairType, isHasLungs);
    }
}
