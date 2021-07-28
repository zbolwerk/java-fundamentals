package labs_examples.objects_classes_methods.labs.oop.C_blackjack.code;

import java.util.ArrayList;
import java.util.Arrays;

public class Deck {
    Card[] cards;
    ArrayList<Integer> usedCards;

    public Deck(Card[] cards) {
        this.cards = cards;
    }

    public Deck() {

    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + Arrays.toString(cards) +
                ", usedCards=" + usedCards +
                '}';
    }
}
