package cards;

public class AnimalCard extends Card {

    private final Animal animal;

    AnimalCard(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return animal.toString();
    }

    @Override
    public boolean snap(Card card) {
        if(card instanceof AnimalCard) {
            return this.animal.equals(((AnimalCard)card).animal);
        }
        return false;
    }
}
