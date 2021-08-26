package labs_examples.objects_classes_methods.labs.oop.C_blackjack.code;

public class Player {
    private String name;
    Hand hand;
    int potValue;

    public Player(String name, int potValue) {
        this.name = name;
        this.potValue = potValue;
        this.hand = new Hand();

    }


}
