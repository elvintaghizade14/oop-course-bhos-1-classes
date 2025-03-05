package az.edu.bhos.lesson12;

public final class Player implements Comparable<Player> {

    public final String name;
    public final int score;
    public final boolean isFemale;

    public Player(String name, int score, boolean isFemale) {
        this.name = name;
        this.score = score;
        this.isFemale = isFemale;
    }

    @Override
    public String toString() {
        return "{\"name\":\"%s\", \"score\":\"%d\", \"isFemale\":\"%s\"}"
                .formatted(name, score, isFemale);
    }

    @Override
    public int compareTo(Player that) {
        int intComp = Integer.compare(that.score, this.score);
        int strComp = this.name.compareTo(that.name);
        return intComp != 0
                ? intComp
                : strComp != 0
                    ? strComp
                    : this.isFemale ? -1 : 1 ;
    }
}
