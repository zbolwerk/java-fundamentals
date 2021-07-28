package labs_examples.objects_classes_methods.labs.oop.C_blackjack.code;

public class Card {
    char[] suits = {'♠', '♦', '♥', '♣'};
    int cardValue;

    //testing to figure out Card
    public Card(char[] suits, int cardValue) {
        this.suits = suits;
        this.cardValue = cardValue;
    }
}