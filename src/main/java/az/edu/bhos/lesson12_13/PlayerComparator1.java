package az.edu.bhos.lesson12_13;

import java.util.Comparator;

public class PlayerComparator1 implements Comparator<Player> {

    @Override
    public int compare(Player player1, Player player2) {
        return Long.compare(player2.id, player1.id);
    }
}
