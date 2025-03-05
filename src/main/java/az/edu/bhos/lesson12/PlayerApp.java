package az.edu.bhos.lesson12;

import java.util.Arrays;

public class PlayerApp {

    public static void main(String[] args) {
        // input
        Player[] players = init();
        System.out.println(Arrays.toString(players));

        // process
        int[] nums = new int[] {7, 0, 1, 2, 6, -1, 10};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        String[] letters = new String[] {"D", "E", "A", "B", "C", "F"};
        System.out.println(Arrays.toString(letters));
        Arrays.sort(letters);
        System.out.println(Arrays.toString(letters));
        Arrays.sort(players);

        // output
        System.out.println(Arrays.toString(players));
    }

    public static Player[] init() {
        return new Player[] {
                new Player("Arzu", 99, true),
                new Player("Arzu", 99, false),
                new Player("Aytac", 100, true),
                new Player("Sanani", 61, false),
        };
    }
}
