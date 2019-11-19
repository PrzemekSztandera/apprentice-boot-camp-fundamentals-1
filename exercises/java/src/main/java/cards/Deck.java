package cards;

import java.util.ArrayList;
import java.util.List;

abstract class Deck {

    List<Card> cards = new ArrayList<>();

    abstract String[] getCards();

    abstract Card deal();

    abstract void shuffle();

    List<Card> getCardsList() {
        return cards;
    }
}
