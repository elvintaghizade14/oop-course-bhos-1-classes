package az.edu.bhos.lesson12_13;

import java.util.Arrays;
import java.util.Comparator;

public class PlayerApp {

    public static void main(String[] args) {
        // input
        Player[] players = init();
        System.out.println(Arrays.toString(players));

        // process
        // Arrays.sort(players, new PlayerComparator1());
        // Arrays.sort(players, new PlayerComparator2());
         Arrays.sort(players, new Comparator<Player>() {
             @Override
             public int compare(Player player1, Player player2) {
                 return player2.name.compareTo(player1.name);
             }
         });
        // Arrays.sort(players, (player1, player2) -> player2.name.compareTo(player1.name));

        // output
        System.out.println(Arrays.toString(players));

        // process
        // int[] nums = new int[] {7, 0, 1, 2, 6, -1, 10};
        // System.out.println(Arrays.toString(nums));
        // Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));

        // String[] letters = new String[] {"D", "E", "A", "B", "C", "F"};
        // System.out.println(Arrays.toString(letters));
        // Arrays.sort(letters);
        // System.out.println(Arrays.toString(letters));
    }

    public static Player[] init() {
        return new Player[] {
                new Player(2L, "Arzu", 99, false),
                new Player(1L, "Arzu", 99, true),
                new Player(5L, "Arzu", 99, true),
                new Player(6L, "Arzu", 61, true),
                new Player(4L, "Sanani", 61, false),
                new Player(3L, "Aytac", 100, true),
        };
    }
}
