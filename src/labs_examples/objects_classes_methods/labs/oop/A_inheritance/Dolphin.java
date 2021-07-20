package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Dolphin extends Mammal {

    private int swimDepth;
    private int swimSpeed;


    public Dolphin(String hairType, boolean isHasLungs) {
        super(hairType, isHasLungs);
    }

    public Dolphin(String hairType, boolean isHasLungs, int swimDepth, int swimSpeed) {
        super(hairType, isHasLungs);
        this.swimDepth = swimDepth;
        this.swimSpeed = swimSpeed;
    }

    @Override
    public boolean sleep() {
        System.out.println("Dolphin is sleeping.");
        super.sleep();
        return false;
    }

    public int getSwimDepth() {
        return swimDepth;
    }

    public void setSwimDepth(int swimDepth) {
        this.swimDepth = swimDepth;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }
}
