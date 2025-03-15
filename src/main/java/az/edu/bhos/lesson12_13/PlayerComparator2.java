package az.edu.bhos.lesson12_13;

import java.util.Comparator;

public class PlayerComparator2 implements Comparator<Player> {

    @Override
    public int compare(Player player1, Player player2) {
        int compareScore = Long.compare(player2.score, player1.score);
        if (compareScore != 0) {
            return compareScore;
        }
        int compareName = player1.compareTo(player2);
        if (compareName != 0) {
            return compareName;
        }
        if (player1.isFemale != player2.isFemale) {
            return player1.isFemale ? 1 : -1;
        }
        return Long.compare(player1.id, player2.id);
    }
}
