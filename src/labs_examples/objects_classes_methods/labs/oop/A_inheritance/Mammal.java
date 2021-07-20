package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Mammal implements Animal {

    protected String hairType;
    protected boolean isHasLungs;

    public Mammal(String hairType, boolean isHasLungs) {
        this.hairType = hairType;
        this.isHasLungs = isHasLungs;
    }


    @Override
    public boolean eat() {
        return true;
    }

    @Override
    public void sleep() {
        System.out.println("Mammal is sleeping.");
    }

    @Override
    public void movement() {
        System.out.println("Mammal is on the move.");
    }

    public String getHairType() {
        return hairType;
    }

    public void setHairType(String hairType) {
        this.hairType = hairType;
    }

    public boolean isHasLungs() {
        return isHasLungs;
    }

    public void setHasLungs(boolean hasLungs) {
        isHasLungs = hasLungs;
    }
}
