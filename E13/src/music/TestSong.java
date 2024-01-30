package music;

import java.util.Arrays;

public class TestSong
{
    public static void main(String[] args) {
        Song[] songs = {
                new Song("ads", "sadq", 23),
                new Song("da", "awd", 52),
                new Song("aws", "aaa", 212),
                new Song("quwert", "daw", 1),
        };

        System.out.println("Przed\n");

        for(Song song : songs)
        {
            System.out.println(song);
        }

        System.out.println("\nPo\n");
        Arrays.sort(songs, new DurationComparator().thenComparing(new ArtistTitleComparator()));

        for(Song song : songs)
        {
            System.out.println(song);
        }
    }
}
