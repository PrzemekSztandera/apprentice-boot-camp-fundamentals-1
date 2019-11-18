package cards;

import java.util.Objects;

public class Suit implements Comparable<Suit>{

    private String name;

    public Suit() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Suit o) {
        return this.getName().compareTo(o.getName());
    }
}
