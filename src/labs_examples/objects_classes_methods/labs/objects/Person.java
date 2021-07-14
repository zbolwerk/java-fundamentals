package labs_examples.objects_classes_methods.labs.objects;

public class Person {

    private int height;
    private int weight;
    private String hairColor;
    private String eyeColor;


    public Person(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public Person(String hairColor, String eyeColor) {
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }

    public Person(int height, int weight, String hairColor, String eyeColor) {
        this.height = height;
        this.weight = weight;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        return "Person{" +
                "height=" + height +
                ", weight=" + weight +
                ", hairColor='" + hairColor + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }
}
