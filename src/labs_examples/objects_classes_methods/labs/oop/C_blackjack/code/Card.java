package labs_examples.objects_classes_methods.labs.oop.C_blackjack.code;

public class Card {
    private int cardValue;
    private int suit;

    public int getCardValue() {
        return cardValue;
    }

    public int getSuit() {
        return suit;
    }

    public Card(int suit, int cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public String toString() {
        char[] suits = {'♠', '♦', '♥', '♣'};
        String[] cardValues = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        return cardValues[this.cardValue] + " of " + suits[this.suit];
    }



}