package cards;

public class AnimalCard implements Card {

    private final Animal animal;

    AnimalCard(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return animal.toString();
    }

    @Override
    public boolean snap(Card object) {
        if(object instanceof AnimalCard) {
            return this.animal.equals(((AnimalCard)object).animal);
        }
        return false;
    }
}
