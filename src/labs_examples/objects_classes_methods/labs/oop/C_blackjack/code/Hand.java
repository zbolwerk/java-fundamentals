package labs_examples.objects_classes_methods.labs.oop.C_blackjack.code;

import java.util.ArrayList;

public class Hand {
    ArrayList<Card> cards;
    int handValue;

    public Hand() {
        this.cards = new ArrayList<Card>();
        this.handValue = 0;


    }

    public int handScore() {

//        Card playerCardValue = cards.get(0);
//        System.out.println("\n" + playerCardValue + "\n");

        Card playerCard;
        int playerCardValue = 0;
        for (int i = 0; i < cards.size(); i++) {
            playerCard = cards.get(i);
            System.out.println("Index " + i + " for playercardvalue: " + playerCard);
            playerCardValue += playerCard.getCardValue();
            System.out.println("Player card value is: " + playerCardValue);
        }
        return playerCardValue;
    }

    public boolean overUnderTwentyOne () {
        //if player.hand > 21
            return true;
        //else if player.hand < 21
        //return false;
        //else - player.hand is 21
    }


    @Override
    public String toString() {
        return "Hand{" +
                "cards=" + cards +
                ", handValue=" + handValue +
                '}';
    }
}
