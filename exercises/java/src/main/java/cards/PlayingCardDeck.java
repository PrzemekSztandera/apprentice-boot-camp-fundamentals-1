package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayingCardDeck implements Deck {

    private List<PlayingCard> playingCards = new ArrayList<>();

    public PlayingCardDeck() {
        generateDeck();
    }


    public static void main(String[] args) {
        PlayingCardDeck playingCardDeck = new PlayingCardDeck();
        String[] deckInOrder = playingCardDeck.getPlayingCards();
        for(String card: deckInOrder){
            System.out.println(card);
        }
    }

    public String[] getPlayingCards() {
        String[] result = new String[52];

        int cardNumber = 0;
        for (PlayingCard playingCard : playingCards) {
            String faceValueName;
            switch (playingCard.getValue()){
                case 0: faceValueName = "ace"; break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9: faceValueName = Integer.toString(playingCard.getValue()+1); break;
                case 10: faceValueName = "jack"; break;
                case 11: faceValueName = "queen"; break;
                case 12: faceValueName = "king"; break;
                default: throw new IllegalArgumentException("Something went wrong " + playingCard.getValue() + "is not a valid faceValue!");
            }

            String suitName = playingCard.getSuit().getName();
            result[cardNumber] = faceValueName + " of " + suitName;
            cardNumber++;
        }

        return result;
    }

    @Override
    public PlayingCard deal() {
        return playingCards.remove(0);
    }

    @Override
    public void shuffle() {
        Collections.shuffle(playingCards);
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
                playingCards.add(new PlayingCard(suitObj, faceValue));
            }
        }
    }

}
