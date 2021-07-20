package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Dog extends Mammal {

    protected int biteStrength;
    protected int jumpHeight;

    public Dog(String hairType, boolean isHasLungs) {
        super(hairType, isHasLungs);
    }

    public Dog(String hairType, boolean isHasLungs, int biteStrength, int jumpHeight) {
        super(hairType, isHasLungs);
        this.biteStrength = biteStrength;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    public int getBiteStrength() {
        return biteStrength;
    }

    public void setBiteStrength(int biteStrength) {
        this.biteStrength = biteStrength;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }
}
