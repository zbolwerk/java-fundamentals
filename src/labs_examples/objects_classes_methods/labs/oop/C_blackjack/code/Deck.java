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

    public void deal(Player player) {
        int min = 1;
        int max = 52;
        int randomCard = (int)Math.floor(Math.random()*(max-min+1)+min);

        while (usedCards.contains((randomCard))) {
            randomCard = (int)Math.floor(Math.random()*(max-min+1)+min);
        }
        player.hand.cards.add(cards[randomCard]);


    }


}
