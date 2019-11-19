package cards;

class PlayingCard extends Card {
    private Suit suit;
    private int value;

    PlayingCard(Suit suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    Suit getSuit() {
        return suit;
    }

    int getValue() {
        return value;
    }

    @Override
    public boolean snap(Card card) {
        if(card instanceof PlayingCard) {
            return this.value == (((PlayingCard)card).value);
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getSuit() + " " + this.getValue();
    }

}
