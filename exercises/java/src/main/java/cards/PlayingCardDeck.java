package cards;

import java.util.Collections;

public class PlayingCardDeck extends Deck {

    public PlayingCardDeck() {
        generateDeck();
    }

    public static void main(String[] args) {
        PlayingCardDeck playingCardDeck = new PlayingCardDeck();
        String[] deckInOrder = playingCardDeck.getCards();
        for(String card: deckInOrder){
            System.out.println(card);
        }
    }

    public String[] getCards() {
        String[] result = new String[52];

        int cardNumber = 0;
        for (Card playingCard : cards) {
            String faceValueName;
            switch (((PlayingCard)playingCard).getValue()){
                case 0: faceValueName = "ace"; break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9: faceValueName = Integer.toString(((PlayingCard)playingCard).getValue()+1); break;
                case 10: faceValueName = "jack"; break;
                case 11: faceValueName = "queen"; break;
                case 12: faceValueName = "king"; break;
                default: throw new IllegalArgumentException("Something went wrong " + ((PlayingCard)playingCard).getValue() + "is not a valid faceValue!");
            }

            String suitName = ((PlayingCard)playingCard).getSuit().toString();
            result[cardNumber] = faceValueName + " of " + suitName;
            cardNumber++;
        }
        return result;
    }

    @Override
    public PlayingCard deal() {
        return (PlayingCard)cards.remove(0);
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }

    private void generateDeck() {
        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                Suit suitObj = null;
                switch (suit){
                    case 0: suitObj = Suit.clubs; break;
                    case 1: suitObj = Suit.diamonds; break;
                    case 2: suitObj = Suit.hearts; break;
                    case 3: suitObj = Suit.spades; break;
                    default:
                }
                cards.add(new PlayingCard(suitObj, faceValue));
            }
        }
    }
}
