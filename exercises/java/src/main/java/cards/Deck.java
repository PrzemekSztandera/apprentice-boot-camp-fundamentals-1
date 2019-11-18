package cards;

public interface Deck {

    String[] getPlayingCards();

    Card deal();

    void shuffle();
}
