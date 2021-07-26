package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Mammal implements Animal {

    protected String hairColor;
    protected boolean isHasLungs;

    public Mammal(String hairColor, boolean isHasLungs) {
        this.hairColor = hairColor;
        this.isHasLungs = isHasLungs;
    }

//    @Override
    public void eat() {
        System.out.println("Mammal is eating.");
    }

//    @Override
    public boolean sleep() {
        System.out.println("Mammal is sleeping.");
        return false;
    }

    @Override
    public void movement() {
        System.out.println("Mammal is on the move.");
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public boolean isHasLungs() {
        return isHasLungs;
    }

    public void setHasLungs(boolean hasLungs) {
        isHasLungs = hasLungs;
    }
}
