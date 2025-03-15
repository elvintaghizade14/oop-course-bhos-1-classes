package az.edu.bhos.lesson12_13;

public final class Player implements Comparable<Player> {

    public final Long id;
    public final String name;
    public final int score;
    public final boolean isFemale;

    public Player(Long id, String name, int score, boolean isFemale) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.isFemale = isFemale;
    }

    @Override
    public String toString() {
        return "{\"id:%d\",\"name\":\"%s\", \"score\":\"%d\", \"isFemale\":\"%s\"}"
                .formatted(id, name, score, isFemale);
    }

    @Override
    public int compareTo(Player that) {
        return Long.compare(this.id, that.id);
    }
}
