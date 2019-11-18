package cards;

class Card {
    private Suit suit;
    private int value;

    Card(Suit suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    Suit getSuit() {
        return suit;
    }

    int getValue() {
        return value;
    }

}
