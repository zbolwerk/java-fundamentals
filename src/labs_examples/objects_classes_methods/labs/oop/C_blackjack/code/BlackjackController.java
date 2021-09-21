package labs_examples.objects_classes_methods.labs.oop.C_blackjack.code;

import java.util.Arrays;

public class BlackjackController {
    public static void main(String[] args) {
//        Card oneCard = new Card(0, 11);
//        System.out.println(oneCard);
//        oneCard = new Card(2, 1);
//        System.out.println(oneCard);

        Deck deck = new Deck();

        Player user = new Player("Bob", 121);
        deck.deal(user);
        System.out.println(user.hand);

        System.out.println("cards" + user.hand.cards);
        System.out.println("Handscore " + user.hand.handScore());

        deck.deal(user);

        System.out.println("cards" + user.hand.cards);
        System.out.println("Handscore " + user.hand.handScore());

    }
}
