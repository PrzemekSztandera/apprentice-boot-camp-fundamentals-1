package cards;

import java.util.Collections;

class AnimalDeck extends Deck {


    public AnimalDeck() {
        generateDeck();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public String[] getCards() {
        String[] result = new String[cards.size()];
        for (int i = 0; i < cards.size(); i++) {
            Card card = cards.get(i);
            result[i] = card.toString();
        }
        return result;
    }

    public Card deal() {
        return cards.remove(0);
    }

    private void generateDeck() {
        for (Animal animal : Animal.values()) {
            cards.add(new AnimalCard(animal));
            cards.add(new AnimalCard(animal));
        }
    }
}
