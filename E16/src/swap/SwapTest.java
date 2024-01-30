package swap;

import java.util.Arrays;

public class SwapTest
{
    public static void main(String[] args) {
        String[] strings = {"kiwi", "banan", "malina"};
        System.out.println("Przed swapem: " + Arrays.toString(strings));
        Swap.swapElements(strings, 0, 2);
        System.out.println("Po swapie: " + Arrays.toString(strings));

        System.out.println();

        VideoGame[] videoGames = {
            new VideoGame("A", "DevA", 4.5f),
            new VideoGame("B", "DevB", 2.5f),
            new VideoGame("C", "DevC", 1.5f),
        };

        System.out.println(Arrays.toString(videoGames));

        System.out.println();

        Swap.swapElements(videoGames, 0, 2);

        System.out.println(Arrays.toString(videoGames));
    }
}
