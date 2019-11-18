package cards;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    private List<Card> cards = new ArrayList<>();

    public Deck() {
        generateDeck();
    }



    public static void main(String[] args) {
        Deck deck = new Deck();
        String[] deckInOrder = deck.getCards();
        for(String card: deckInOrder){
            System.out.println(card);
        }
    }

    String[] getCards() {
        String[] result = new String[52];

        int cardNumber = 0;
        for (Card card : cards) {
            String faceValueName;
            switch (card.getValue()){
                case 0: faceValueName = "ace"; break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9: faceValueName = Integer.toString(card.getValue()+1); break;
                case 10: faceValueName = "jack"; break;
                case 11: faceValueName = "queen"; break;
                case 12: faceValueName = "king"; break;
                default: throw new IllegalArgumentException("Something went wrong " + card.getValue() + "is not a valid faceValue!");
            }

            String suitName = card.getSuit().getName();
            result[cardNumber] = faceValueName + " of " + suitName;
            cardNumber++;
        }

        return result;
    }

    private void generateDeck() {
        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                Suit suitObj = new Suit();
                switch (suit){
                    case 0: suitObj.setName("clubs"); break;
                    case 1: suitObj.setName("diamonds"); break;
                    case 2: suitObj.setName("hearts"); break;
                    case 3: suitObj.setName("spades"); break;
                    default:
                }
                cards.add(new Card(suitObj, faceValue));
            }
        }
    }

}
