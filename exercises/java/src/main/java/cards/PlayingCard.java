package cards;

import java.util.Comparator;
import java.util.Objects;

class PlayingCard implements Card, Comparable<PlayingCard> {
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
    public boolean snap(Card object) {
        if(object instanceof PlayingCard) {
            return object !=null && this.suit.getName().equals(((PlayingCard)object).getSuit().getName());
        }
        return false;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlayingCard)) return false;
        PlayingCard that = (PlayingCard) o;
        return getValue() == that.getValue() &&
                Objects.equals(getSuit(), that.getSuit());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSuit(), getValue());
    }

    @Override
    public int compareTo(PlayingCard o) {
        return Comparator.comparing(PlayingCard::getSuit).thenComparing(PlayingCard::getValue).compare(this, o);
    }

    @Override
    public String toString() {
        return this.getSuit().getName() + " " + this.getValue();
    }
}
