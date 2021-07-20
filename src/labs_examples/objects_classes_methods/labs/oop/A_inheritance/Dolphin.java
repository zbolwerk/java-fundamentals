package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public abstract class Dolphin extends Mammal {

    private int swimDepth;
    private int swimSpeed;


    public Dolphin(String hairType, boolean isHasLungs) {
        super(hairType, isHasLungs);
    }

    public Dolphin(String hairType, boolean isHasLungs, int swimDepth, int swimSpeed) {
        super(hairType, isHasLungs);
    }
}
