package labs_examples.objects_classes_methods.labs.oop.C_blackjack.code;

import java.util.ArrayList;

public class Deck {
    Card[] cards;
    ArrayList<Integer> usedCards;

    public Deck(Card[] cards) {
        this.cards = cards;
    }
}
