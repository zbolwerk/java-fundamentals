package labs_examples.objects_classes_methods.labs.oop.C_blackjack.code;

import java.util.ArrayList;

public class Deck {
    Card[] cards = new Card[52];
    ArrayList<Integer> usedCards;

    public Deck() {
        int counter = 0;
        usedCards = new ArrayList<Integer>();
        for (int cardSuit = 0; cardSuit < 4; cardSuit++) {
            for (int cardValue = 1; cardValue < 14; cardValue++) {
                cards[counter] = new Card (cardSuit, cardValue);
                counter++;
            }
        }
    }


}
