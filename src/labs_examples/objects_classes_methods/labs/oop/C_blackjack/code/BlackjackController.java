package labs_examples.objects_classes_methods.labs.oop.C_blackjack.code;

public class BlackjackController {
    public static void main(String[] args) {
        Card oneCard = new Card(0, 11);
        System.out.println(oneCard);
        oneCard = new Card(2, 9);
        System.out.println(oneCard);
    }
}
