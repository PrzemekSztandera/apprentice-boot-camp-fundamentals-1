package cards;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class MasterDeck extends Deck {


    MasterDeck(PlayingCardDeck playingCardDeck, AnimalDeck animalDeck) {
        cards = Stream.concat(playingCardDeck.getCardsList().stream(), animalDeck.getCardsList().stream())
                .collect(Collectors.toList());
    }

    @Override
    String[] getCards() {
        String[] result = new String[cards.size()];
        for (int i = 0; i < cards.size(); i++) {
            Card card = cards.get(i);
            result[i] = card.toString();
        }
        return result;
    }

    @Override
    Card deal() {
        return cards.remove(0);
    }

    @Override
    void shuffle() {
        Collections.shuffle(cards);
    }

}
